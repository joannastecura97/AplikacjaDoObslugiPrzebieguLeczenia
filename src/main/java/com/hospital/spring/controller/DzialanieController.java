/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

/**
 *
 * @author stecu
 */
import com.hospital.spring.DTO.DzialanieDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.exception.CustomException;
import com.hospital.spring.form.DataForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.hospital.spring.service.DzialanieService;
import com.hospital.spring.service.PracownikService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.hospital.spring.toolDTO.BuilderDTO;

@Controller
@RequestMapping("stronaGlowna")
public class DzialanieController {

    private DzialanieService dzialanieService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "dzialanieService")
    public void setDzialanieService(DzialanieService ps) {
        this.dzialanieService = ps;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listDzialanie(@ModelAttribute("errMsg") String errMsg, Authentication authentication, @ModelAttribute("dataForm") DataForm dataForm, Model model) {
        model.addAttribute("errMsg", errMsg);
        String login = authentication.getName();
        PracownikDTO pracdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracdto);
        model.addAttribute("dataForm", dataForm);
        model.addAttribute("dzialanie", new DzialanieDTO());
        model.addAttribute("listDzialanie", this.dzialanieService.listDzialanieData(pracdto.getLogin(), dataForm.getData()));
        return "stronaGlowna";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addDzialanie(@ModelAttribute("dzialanie") DzialanieDTO dzialaniedto, Authentication authentication) {
        String login = authentication.getName();
        try {
            this.dzialanieService.addDzialanie(dzialaniedto, login);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }
        return "redirect:/stronaGlowna";

    }

    @RequestMapping(value = "/removeDzialanie", method = RequestMethod.POST)
    public String removeDzialanie(@ModelAttribute("dzialanie") DzialanieDTO dzialanie, Authentication authentication) {
        String login = authentication.getName();
        System.out.println("Printuje date: " + dzialanie.getData().toString() + "   " + dzialanie.getOpis());
        this.dzialanieService.removeDzialanie(login, dzialanie.getData());
        return "redirect:/stronaGlowna";
    }

    @RequestMapping(value = "/dataDzialanie", method = RequestMethod.POST)
    public String editDzialanie(@ModelAttribute("dataForm") DataForm dataForm, final RedirectAttributes redirectAttributes, Model model) {

        redirectAttributes.addFlashAttribute("dataForm", dataForm);
        model.addAttribute("dataForm", dataForm);
        System.out.println(dataForm.getData());
        return "redirect:/stronaGlowna";
    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/stronaGlowna");
        return model;
    }

}

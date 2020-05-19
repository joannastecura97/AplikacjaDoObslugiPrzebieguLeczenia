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
import com.hospital.spring.DTO.KsiegaChorychOddzialuDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.exception.CustomException;
import com.hospital.spring.service.KsiegaChorychOddzialuService;
import com.hospital.spring.service.PracownikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ksiegaChorychOddzialu")
public class KsiegaChorychOddzialuController {

    private KsiegaChorychOddzialuService ksiegaChorychOddzialuService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "ksiegaChorychOddzialuService")
    public void setKsiegaChorychOddzialuService(KsiegaChorychOddzialuService ps) {
        this.ksiegaChorychOddzialuService = ps;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listKsiegaPrzyjecWypisow(@ModelAttribute("errMsg") String errMsg, Authentication authentication, Model model) {

        model.addAttribute("errMsg", errMsg);
        String login = authentication.getName();
        PracownikDTO pracdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracdto);
        model.addAttribute("ksiegaChorychOddzialu", new KsiegaChorychOddzialuDTO());
        model.addAttribute("listKsiegaChorychOddzialu", this.ksiegaChorychOddzialuService.listKsiegaChorychOddzialu());
        return "ksiegaChorychOddzialu";
    }

    //For add and update person both
    @RequestMapping(method = RequestMethod.POST)
    public String addKsiegaChorychOddzialu(@ModelAttribute("ksiegaChorychOddzialu") KsiegaChorychOddzialuDTO kcho) {

        try {
            this.ksiegaChorychOddzialuService.addKsiegaChorychOddzialu(kcho);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/ksiegaChorychOddzialu";
    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/ksiegaChorychOddzialu");
        return model;
    }

}

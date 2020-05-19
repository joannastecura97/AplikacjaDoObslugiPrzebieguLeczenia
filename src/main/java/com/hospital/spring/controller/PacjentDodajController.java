/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.exception.CustomException;
import com.hospital.spring.service.PacjentService;
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

/**
 *
 * @author stecu
 */
@Controller
@RequestMapping("pacjentDodaj")
public class PacjentDodajController {

    private PacjentService pacjentService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "pacjentService")
    public void setPacjentService(PacjentService ps) {
        this.pacjentService = ps;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listPacjents(@ModelAttribute("errMsg") String errMsg, Authentication authentication, Model model) {
        model.addAttribute("errMsg", errMsg);
        String login = authentication.getName();
        PracownikDTO pracdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracdto);
        model.addAttribute("pacjent", new PacjentDTO());
        return "pacjentDodaj";
    }

    //For add and update person both
    @RequestMapping(method = RequestMethod.POST)
    public String addPacjent(@ModelAttribute("pacjent") PacjentDTO p) {

        //new person, add it
        try {
            this.pacjentService.addPacjent(p);

        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/pacjenci";

    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/pacjentDodaj");
        return model;
    }

}

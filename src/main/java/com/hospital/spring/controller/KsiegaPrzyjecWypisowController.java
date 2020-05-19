/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.DTO.KsiegaPrzyjecWypisowDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.exception.CustomException;
import com.hospital.spring.service.KsiegaPrzyjecWypisowService;
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
@RequestMapping("ksiegaPrzyjecWypisow")
public class KsiegaPrzyjecWypisowController {

    private KsiegaPrzyjecWypisowService ksiegaPrzyjecWypisowService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "ksiegaPrzyjecWypisowService")
    public void setKsiegaPrzyjecWypisowService(KsiegaPrzyjecWypisowService ps) {
        this.ksiegaPrzyjecWypisowService = ps;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listKsiegaPrzyjecWypisow(@ModelAttribute("errMsg") String errMsg, Authentication authentication, Model model) {
        model.addAttribute("errMsg", errMsg);
        String login = authentication.getName();
        PracownikDTO pracdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracdto);
        model.addAttribute("ksiegaPrzyjecWypisow", new KsiegaPrzyjecWypisowDTO());
        model.addAttribute("listKsiegaPrzyjecWypisow", this.ksiegaPrzyjecWypisowService.listKsiegaPrzyjecWypisow());
        return "ksiegaPrzyjecWypisow";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addKsiegaPrzyjecWypisow(@ModelAttribute("ksiegaPrzyjecWypisow") KsiegaPrzyjecWypisowDTO p) {

        try {
            this.ksiegaPrzyjecWypisowService.addKsiegaPrzyjecWypisow(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/ksiegaPrzyjecWypisow";

    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/ksiegaPrzyjecWypisow");
        return model;
    }
}

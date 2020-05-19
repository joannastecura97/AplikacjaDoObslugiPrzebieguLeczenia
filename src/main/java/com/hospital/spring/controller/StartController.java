/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.exception.CustomException;
import com.hospital.spring.form.LoginForm;
import com.hospital.spring.service.PracownikService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author stecu
 */
@Controller
public class StartController {

    private PracownikService pracownikService;

    //@Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView m = new ModelAndView();
        if (error != null) {
            m.addObject("error", "Błędny login lub hasło.");
        }

        if (logout != null) {
            m.addObject("msg", "Wylogowano pomyślnie.");
        }

        m.setViewName("login");
        return m;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processForm(@Valid LoginForm loginForm, BindingResult result,
            Model model, final RedirectAttributes redirectAttributes) {

        return "redirect:/stronaGlowna";
    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/start");
        return model;
    }

}

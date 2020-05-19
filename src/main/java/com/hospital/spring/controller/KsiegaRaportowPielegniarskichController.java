/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.DTO.KsiegaRaportowPielegniarskichDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.service.KsiegaRaportowPielegniarskichService;
import com.hospital.spring.service.PracownikService;
import org.hibernate.TransientPropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author stecu
 */

@Controller
public class KsiegaRaportowPielegniarskichController {

    private KsiegaRaportowPielegniarskichService ksiegaRaportowPielegniarskichService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "ksiegaRaportowPielegniarskichService")
    public void setKsiegaZabiegowPielegniarskichService(KsiegaRaportowPielegniarskichService ps) {
        this.ksiegaRaportowPielegniarskichService = ps;
    }

    @RequestMapping(value = "/ksiegaRaportowPielegniarskich", method = RequestMethod.GET)
    public String listKsiegaRaportowPielegniarskich(Authentication authentication, Model model) {

        String login = authentication.getName();
        PracownikDTO pracdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracdto);
        model.addAttribute("ksiegaRaportowPielegniarskich", new KsiegaRaportowPielegniarskichDTO());
        model.addAttribute("listKsiegaRaportowPielegniarskich", this.ksiegaRaportowPielegniarskichService.listKsiegaRaportowPielegniarskich());
        return "ksiegaRaportowPielegniarskich";
    }

    @ExceptionHandler(value = TransientPropertyValueException.class)
    public String transientPropertyValueException() {

        return "exception";
    }
}

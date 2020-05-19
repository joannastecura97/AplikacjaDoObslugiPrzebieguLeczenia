/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.form.PacjentForm;
import com.hospital.spring.service.PacjentService;
import com.hospital.spring.service.PracownikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author stecu
 */
@Controller
@SessionAttributes("pacjent")
@RequestMapping("pacjenci")
public class PacjentController {

    private PacjentService pacjentService;

    private PracownikService pracownikService;

    @Autowired(required = true)
    @Qualifier(value = "pracownikService")
    public void setPracownikService(PracownikService ps) {
        this.pracownikService = ps;
    }

    @ModelAttribute("pacjent")
    public PacjentDTO pacjents() {
        return new PacjentDTO();
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
        model.addAttribute("listPacjents", this.pacjentService.listPacjents());
        PacjentForm pacjentForm = new PacjentForm();
        model.addAttribute("pacjentForm", pacjentForm);
        return "pacjent";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String findPacjent(@ModelAttribute("pacjentForm") PacjentForm pacjentForm, Model model, RedirectAttributes redirectAttributes) {
        PacjentDTO pacjent = null;

        pacjent = this.pacjentService.getPacjentByPESELorZnakIdentyfikacyjny(pacjentForm.getPesel());
        if (pacjent != null) {
            model.addAttribute("pacjent", pacjent);
            redirectAttributes.addFlashAttribute("pacjent", pacjent);
            return "redirect:/dokumentyPacjenta";
        } else {
            return "redirect:/pacjentDodaj";
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.controller;

import com.hospital.spring.DTO.HistoriaChorobyDTO;
import com.hospital.spring.DTO.KartaInformacyjnaDTO;
import com.hospital.spring.DTO.KsiegaRaportowLekarskichDTO;
import com.hospital.spring.DTO.KsiegaZabiegowDTO;
import com.hospital.spring.DTO.OsobaUpowaznionaDTO;
import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.DTO.PrzebiegHospitalizacjiDTO;
import com.hospital.spring.DTO.RaportPielegniarskiDTO;
import com.hospital.spring.DTO.WpisDoSzpitalaDTO;
import com.hospital.spring.DTO.WypisZeSzpitalaDTO;
import com.hospital.spring.DTO.WywiadPielegniarskiDTO;
import com.hospital.spring.exception.CustomException;
import com.hospital.spring.service.HistoriaChorobyService;
import com.hospital.spring.service.KartaInformacyjnaService;
import com.hospital.spring.service.KsiegaRaportowLekarskichService;
import com.hospital.spring.service.KsiegaZabiegowService;
import com.hospital.spring.service.OsobaUpowaznionaService;
import com.hospital.spring.service.PracownikService;
import com.hospital.spring.service.PrzebiegHospitalizacjiService;
import com.hospital.spring.service.RaportPielegniarskiService;
import com.hospital.spring.service.WpisDoSzpitalaService;
import com.hospital.spring.service.WypisZeSzpitalaService;
import com.hospital.spring.service.WywiadPielegniarskiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author stecu
 */
@Controller
@SessionAttributes("pacjent")
@RequestMapping("dokumentyPacjenta")
public class DokumentyPacjentaController {

    private HistoriaChorobyService historiaChorobyService;
    private WpisDoSzpitalaService wpisDoSzpitalaService;
    private WypisZeSzpitalaService wypisZeSzpitalaService;
    private PrzebiegHospitalizacjiService przebiegHospitalizacjiService;
    private OsobaUpowaznionaService osobaUpowaznionaService;
    private RaportPielegniarskiService raportPielegniarskiService;
    private WywiadPielegniarskiService wywiadPielegniarskiService;
    private KartaInformacyjnaService kartaInformacyjnaService;
    private KsiegaRaportowLekarskichService ksiegaRaportowLekarskichService;
    private KsiegaZabiegowService ksiegaZabiegowService;
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
    @Qualifier(value = "ksiegaZabiegowService")
    public void setKsiegaZabiegowService(KsiegaZabiegowService ps) {
        this.ksiegaZabiegowService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "ksiegaRaportowLekarskichService")
    public void setKsiegaRaportowLekarskichService(KsiegaRaportowLekarskichService ps) {
        this.ksiegaRaportowLekarskichService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "kartaInformacyjnaService")
    public void setKartaInformacyjnaService(KartaInformacyjnaService ps) {
        this.kartaInformacyjnaService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "wywiadPielegniarskiService")
    public void setWywiadPielegniarskiService(WywiadPielegniarskiService ps) {
        this.wywiadPielegniarskiService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "raportPielegniarskiService")
    public void setRaportPielegniarskiService(RaportPielegniarskiService ps) {
        this.raportPielegniarskiService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "osobaUpowaznionaService")
    public void setOsobaUpowaznionaService(OsobaUpowaznionaService ps) {
        this.osobaUpowaznionaService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "przebiegHospitalizacjiService")
    public void setPrzebiegHospitalizacjiService(PrzebiegHospitalizacjiService ps) {
        this.przebiegHospitalizacjiService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "wypisZeSzpitalaService")
    public void setWypisZeSzpitalaService(WypisZeSzpitalaService ps) {
        this.wypisZeSzpitalaService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "wpisDoSzpitalaService")
    public void setWpisDoSzpitalaService(WpisDoSzpitalaService ps) {
        this.wpisDoSzpitalaService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "historiaChorobyService")
    public void sethistoriaChorobyService(HistoriaChorobyService ps) {
        this.historiaChorobyService = ps;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listHistoriaChorob(@ModelAttribute("errMsg") String errMsg, Authentication authentication, @ModelAttribute("pacjent") PacjentDTO pacjent, Model model) {
        model.addAttribute("errMsg", errMsg);
        model.addAttribute("pacjent", pacjent);
        String login = authentication.getName();
        PracownikDTO pracownikdto = this.pracownikService.checkLogin(login);
        model.addAttribute("pracownik", pracownikdto);
        model.addAttribute("historiaChoroby", new HistoriaChorobyDTO());
        model.addAttribute("kartaInformacyjna", new KartaInformacyjnaDTO());
        model.addAttribute("ksiegaRaportowLekarskich", new KsiegaRaportowLekarskichDTO());
        model.addAttribute("ksiegaZabiegow", new KsiegaZabiegowDTO());
        model.addAttribute("osobaUpowazniona", new OsobaUpowaznionaDTO());
        model.addAttribute("raportPielegniarski", new RaportPielegniarskiDTO());
        model.addAttribute("wpisDoSzpitala", new WpisDoSzpitalaDTO());
        model.addAttribute("wypisZeSzpitala", new WypisZeSzpitalaDTO());
        model.addAttribute("wywiadPielegniarski", new WywiadPielegniarskiDTO());
        model.addAttribute("przebiegHospitalizacji", new PrzebiegHospitalizacjiDTO());

        model.addAttribute("listHistoriaChorob", this.historiaChorobyService.listHistoriaChorobPacjenta(pacjent.getPesel()));
        model.addAttribute("listWpisyDoSzpitala", this.wpisDoSzpitalaService.listWpisDoSzpitalaPacjenta(pacjent.getPesel()));
        model.addAttribute("listWypisyZeSzpitala", this.wypisZeSzpitalaService.listWypisZeSzpitalaPacjenta(pacjent.getPesel()));
        model.addAttribute("listPrzebiegHospitalizacji", this.przebiegHospitalizacjiService.listPrzebiegHospitalizacjiPacjenta(pacjent.getPesel()));
        model.addAttribute("listOsobaUpowazniona", this.osobaUpowaznionaService.listOsobaUpowaznionaPacjenta(pacjent.getPesel()));
        model.addAttribute("listRaportPielegniarski", this.raportPielegniarskiService.listRaportPielegniarskiPacjenta(pacjent.getPesel()));
        model.addAttribute("listWywiadPielegniarski", this.wywiadPielegniarskiService.listWywiadPielegniarskiPacjenta(pacjent.getPesel()));
        model.addAttribute("listKartaInformacyjna", this.kartaInformacyjnaService.listKartaInformacyjnaPacjenta(pacjent.getPesel()));
        model.addAttribute("listKsiegaRaportowLekarskich", this.ksiegaRaportowLekarskichService.listKsiegaRaportowLekarskichPacjenta(pacjent.getPesel()));
        model.addAttribute("listKsiegaZabiegow", this.ksiegaZabiegowService.listKsiegaZabiegowPacjenta(pacjent.getPesel()));
        return "dokumentyPacjenta";

    }

    @RequestMapping(value = "/historiaChoroby/add", method = RequestMethod.POST)
    public String addHistoriaChoroby(@ModelAttribute("historiaChoroby") HistoriaChorobyDTO p) {

        //new person, add it
        try {
            this.historiaChorobyService.addHistoriaChoroby(p);

        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/kartaInformacyjna/add", method = RequestMethod.POST)
    public String addKartaInformacyjna(@ModelAttribute("kartaInformacyjna") KartaInformacyjnaDTO p) {

        //new person, add it
        try {
            this.kartaInformacyjnaService.addKartaInformacyjna(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/ksiegaRaportowLekarskich/add", method = RequestMethod.POST)
    public String addKsiegaRaportowLekarskich(@ModelAttribute("ksiegaRaportowLekarskich") KsiegaRaportowLekarskichDTO p) {
        //new person, add it
        try {
            this.ksiegaRaportowLekarskichService.addKsiegaRaportowLekarskich(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/ksiegaZabiegow/add", method = RequestMethod.POST)
    public String addKsiegaZabiegow(@ModelAttribute("ksiegaZabiegow") KsiegaZabiegowDTO p) {

        try {
            this.ksiegaZabiegowService.addKsiegaZabiegow(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/osobaUpowazniona/add", method = RequestMethod.POST)
    public String addOsobaUpowazniona(@ModelAttribute("osobaUpowazniona") OsobaUpowaznionaDTO p) {

        try {
            this.osobaUpowaznionaService.addOsobaUpowazniona(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping("/removeOsobaUpowazniona/{nrTelefonu}")
    public String removeOsobaUpowazniona(@PathVariable("nrTelefonu") String tel) {

        this.osobaUpowaznionaService.removeOsobaUpowazniona(tel);
        return "redirect:/dokumentyPacjenta";
    }

    @RequestMapping(value = "/wpisDoSzpitala/add", method = RequestMethod.POST)
    public String addWpisDoSzpitala(@ModelAttribute("wpisDoSzpitala") WpisDoSzpitalaDTO p) {

        try {
            this.wpisDoSzpitalaService.addWpisDoSzpitala(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/wypisZeSzpitala/add", method = RequestMethod.POST)
    public String addWypisZeSzpitala(@ModelAttribute("wypisZeSzpitala") WypisZeSzpitalaDTO p) {
        //new person, add it
        try {
            this.wypisZeSzpitalaService.addWypisZeSzpitala(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @RequestMapping(value = "/przebiegHospitalizacji/add", method = RequestMethod.POST)
    public String addPrzebiegHospitalizacji(@ModelAttribute("przebiegHospitalizacji") PrzebiegHospitalizacjiDTO p) {
        //new person, add it
        try {
            this.przebiegHospitalizacjiService.addPrzebiegHospitalizacji(p);
        } catch (Exception ex) {
            throw new CustomException("Wprowadzono niepoprawne dane.");
        }

        return "redirect:/dokumentyPacjenta";

    }

    @ExceptionHandler(CustomException.class)
    public ModelAndView handleCustomException(CustomException mex) {

        ModelAndView model = new ModelAndView();
        model.addObject("errMsg", mex.getErrMsg());
        model.setViewName("redirect:/dokumentyPacjenta");
        return model;
    }

}

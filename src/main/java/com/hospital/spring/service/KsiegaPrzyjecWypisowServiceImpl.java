/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaPrzyjecWypisowDTO;
import com.hospital.spring.dao.KsiegaPrzyjecWypisowDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.SzpitalKomOrgDAO;
import com.hospital.spring.dao.WpisDoSzpitalaDAO;
import com.hospital.spring.dao.WypisZeSzpitalaDAO;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hospital.spring.toolDTO.BuilderDTO;

/**
 *
 * @author stecu
 */
@Transactional
@Service
public class KsiegaPrzyjecWypisowServiceImpl implements KsiegaPrzyjecWypisowService {

    private KsiegaPrzyjecWypisowDAO ksiegaPrzyjecWypisowDAO;

    @Autowired
    private PracownikDAO pracownikDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    @Autowired
    private SzpitalKomOrgDAO szpitalDAO;

    @Autowired
    private WpisDoSzpitalaDAO wpisDoSzpitalaDAO;

    @Autowired
    private WypisZeSzpitalaDAO wypisZeSzpitalaDAO;

    public void setWypisZeSzpitalaDAO(WypisZeSzpitalaDAO wypisZeSzpitalaDAO) {
        this.wypisZeSzpitalaDAO = wypisZeSzpitalaDAO;
    }

    public void setWpisDoSzpitalaDAO(WpisDoSzpitalaDAO wpisDoSzpitalaDAO) {
        this.wpisDoSzpitalaDAO = wpisDoSzpitalaDAO;
    }

    public void setKsiegaPrzyjecWypisowDAO(KsiegaPrzyjecWypisowDAO ksiegaPrzyjecWypisowDAO) {
        this.ksiegaPrzyjecWypisowDAO = ksiegaPrzyjecWypisowDAO;
    }

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }

    public void setSzpitalKomOrgDAO(SzpitalKomOrgDAO szpitalDAO) {
        this.szpitalDAO = szpitalDAO;
    }

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    @Override
    @Transactional
    public void addKsiegaPrzyjecWypisow(KsiegaPrzyjecWypisowDTO p) {

        KsiegaPrzyjecWypisow ksiega = new KsiegaPrzyjecWypisow();
        ksiega.setIdWpisu(this.wpisDoSzpitalaDAO.getWpisDoSzpitalaById(p.getNrWpisu()));
        System.out.println("nr wypisy");
        ksiega.setIdWypisu(this.wypisZeSzpitalaDAO.getWypisZeSzpitalaById(p.getNrWypisu()));
        ksiega.setMiejsceGdzieZostalWypisany(p.getMiejsceGdzieZostalWypisany());
        ksiega.setNrKartyDepozytowej(p.getNrKartyDepozytowej());
        System.out.println("Tu jestem");
        ksiega.setNrPwzLekarz(this.pracownikDAO.getPracownikByNrPWZ(p.getNrPwzLekarz().getNrPWZ()));
        System.out.println("teraz tutaj");
        ksiega.setNrResortowyKom(this.szpitalDAO.getSzpitalKomOrgByNrResortowy(p.getNrResortowyKom()));
        ksiega.setOkolicznosciTr(p.getOkolicznosciTr());
        ksiega.setPesel(this.pacjentDAO.getPacjentByPESEL(p.getPesel()));
        ksiega.setPobranieOplat(p.getPobranieOplat());
        ksiega.setRozpOnkologiczne(p.getRozpOnkologiczne());
        ksiega.setTransportSanitarny(p.getTransportSanitarny());
        this.ksiegaPrzyjecWypisowDAO.addKsiegaPrzyjecWypisow(ksiega);
    }

    @Override
    public List<KsiegaPrzyjecWypisowDTO> listKsiegaPrzyjecWypisow() {
        List<KsiegaPrzyjecWypisow> lista = this.ksiegaPrzyjecWypisowDAO.listKsiegaPrzyjecWypisow();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiPrzyjecWypisowDTO(lista);
    }

}

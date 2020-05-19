/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaRaportowLekarskichDTO;
import com.hospital.spring.dao.KsiegaRaportowLekarskichDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.SzpitalKomOrgDAO;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
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
public class KsiegaRaportowLekarskichServiceImpl implements KsiegaRaportowLekarskichService {

    private KsiegaRaportowLekarskichDAO ksiegaRaportowLekarskichDAO;

    public void setKsiegaRaportowLekarskichDAO(KsiegaRaportowLekarskichDAO ksiegaRaportowLekarskichDAO) {
        this.ksiegaRaportowLekarskichDAO = ksiegaRaportowLekarskichDAO;
    }

    @Autowired
    private PracownikDAO pracownikDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }
    @Autowired
    private SzpitalKomOrgDAO szpitalDAO;

    public void setSzpitalKomOrgDAO(SzpitalKomOrgDAO szpitalDAO) {
        this.szpitalDAO = szpitalDAO;
    }

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    @Override
    @Transactional
    public void addKsiegaRaportowLekarskich(KsiegaRaportowLekarskichDTO p) {
        KsiegaRaportowLekarskich ksiega = new KsiegaRaportowLekarskich();
        ksiega.setData(p.getData());
        ksiega.setNrKomOrg(this.szpitalDAO.getSzpitalKomOrgByNrResortowy(p.getNrKomOrg()));
        ksiega.setPacjent(this.pacjentDAO.getPacjentByPESEL(p.getPacjent()));
        ksiega.setLekarz(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarz().getNrPWZ()));
        ksiega.setSprawozdanie(p.getSprawozdanie());
        this.ksiegaRaportowLekarskichDAO.addKsiegaRaportowLekarskich(ksiega);
    }

    @Override
    public List<KsiegaRaportowLekarskichDTO> listKsiegaRaportowLekarskich() {
        List<KsiegaRaportowLekarskich> lista = this.ksiegaRaportowLekarskichDAO.listKsiegaRaportowLekarskich();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiRaportowLekarskichDTO(lista);
    }

    @Override
    public List<KsiegaRaportowLekarskichDTO> listKsiegaRaportowLekarskichPacjenta(String pesel) {
        List<KsiegaRaportowLekarskich> lista = this.ksiegaRaportowLekarskichDAO.listKsiegaRaportowLekarskichPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiRaportowLekarskichDTO(lista);
    }
}

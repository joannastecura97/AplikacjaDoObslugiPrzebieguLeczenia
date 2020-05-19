/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

/**
 *
 * @author stecu
 */
import com.hospital.spring.DTO.KsiegaChorychOddzialuDTO;
import com.hospital.spring.dao.KsiegaChorychOddzialuDAO;
import com.hospital.spring.dao.KsiegaPrzyjecWypisowDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.SzpitalKomOrgDAO;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hospital.spring.toolDTO.BuilderDTO;

@Transactional
@Service
public class KsiegaChorychOddzialuServiceImpl implements KsiegaChorychOddzialuService {

    private KsiegaChorychOddzialuDAO ksiegaChorychOddzialuDAO;

    @Autowired
    private PracownikDAO pracownikDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    @Autowired
    private SzpitalKomOrgDAO szpitalDAO;

    @Autowired
    private KsiegaPrzyjecWypisowDAO ksiegaPrzyjecWypisowDAO;

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

    public void setKsiegaChorychOddzialuDAO(KsiegaChorychOddzialuDAO ksiegaChorychOddzialuDAO) {
        this.ksiegaChorychOddzialuDAO = ksiegaChorychOddzialuDAO;
    }

    @Override
    @Transactional
    public void addKsiegaChorychOddzialu(KsiegaChorychOddzialuDTO p) {
        KsiegaChorychOddzialu ksiega = new KsiegaChorychOddzialu();
        ksiega.setLekarzProw(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarzProw().getNrPWZ()));
        ksiega.setNrKomOrg(this.szpitalDAO.getSzpitalKomOrgByNrResortowy(p.getNrKomOrg()));
        ksiega.setNrKsiegaPrzyjec(this.ksiegaPrzyjecWypisowDAO.getKsiegaPrzyjecWypisowById(p.getNrKsiegaPrzyjec()));
        ksiega.setPesel(this.pacjentDAO.getPacjentByPESEL(p.getPesel()));
        this.ksiegaChorychOddzialuDAO.addKsiegaChorychOddzialu(ksiega);
    }

    @Override
    public List<KsiegaChorychOddzialuDTO> listKsiegaChorychOddzialu() {

        List<KsiegaChorychOddzialu> lista = this.ksiegaChorychOddzialuDAO.listKsiegaChorychOddzialu();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiChorychOddzialuDTO(lista);
    }

}

package com.hospital.spring.service;

import com.hospital.spring.DTO.KartaInformacyjnaDTO;
import com.hospital.spring.dao.KartaInformacyjnaDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.SzpitalKomOrgDAO;
import com.hospital.spring.model.KartaInformacyjna;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hospital.spring.toolDTO.BuilderDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stecu
 */
@Transactional
@Service
public class KartaInformacyjnaServiceImpl implements KartaInformacyjnaService {

    private KartaInformacyjnaDAO kartaInformacyjnaDAO;

    @Autowired
    private PracownikDAO pracownikDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    @Autowired
    private SzpitalKomOrgDAO szpitalDAO;

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }

    public void setSzpitalKomOrgDAO(SzpitalKomOrgDAO szpitalDAO) {
        this.szpitalDAO = szpitalDAO;
    }

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    public void setKartaInformacyjnaDAO(KartaInformacyjnaDAO kartaInformacyjnaDAO) {
        this.kartaInformacyjnaDAO = kartaInformacyjnaDAO;
    }

    @Override
    @Transactional
    public void addKartaInformacyjna(KartaInformacyjnaDTO p) {
        KartaInformacyjna k = new KartaInformacyjna();
        k.setDataWydania(p.getDataWydania());
        k.setEpikryza(p.getEpikryza());
        k.setLeczenie(p.getLeczenie());
        k.setLeki(p.getLeki());
        k.setNrKomOrg(this.szpitalDAO.getSzpitalKomOrgByNrResortowy(p.getNrKomOrg()));
        k.setNrPwzLekarz(this.pracownikDAO.getPracownikByNrPWZ(p.getNrPwzLekarz().getNrPWZ()));
        k.setOkresNiezdolnosci(p.getOkresNiezdolnosci());
        k.setPacjent(this.pacjentDAO.getPacjentByPESEL(p.getPacjent()));
        k.setRozpoznania(p.getRozpoznania());
        k.setWynikiBadan(p.getWynikiBadan());
        k.setZalecenia(p.getZalecenia());
        this.kartaInformacyjnaDAO.addKartaInformacyjna(k);
    }

    @Override
    public List<KartaInformacyjnaDTO> listKartaInformacyjnaPacjenta(String pesel) {
        List<KartaInformacyjna> lista = this.kartaInformacyjnaDAO.listKartaInformacyjnaPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKartaInformacyjnaPacjentaDTO(lista);
    }
}

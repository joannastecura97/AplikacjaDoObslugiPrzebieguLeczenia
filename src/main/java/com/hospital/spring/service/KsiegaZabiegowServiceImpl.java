/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaZabiegowDTO;
import com.hospital.spring.dao.KsiegaZabiegowDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.SzpitalKomOrgDAO;
import com.hospital.spring.model.KsiegaZabiegow;
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
public class KsiegaZabiegowServiceImpl implements KsiegaZabiegowService {

    private KsiegaZabiegowDAO ksiegaZabiegowDAO;
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

    public void setKsiegaZabiegowDAO(KsiegaZabiegowDAO ksiegaZabiegowDAO) {
        this.ksiegaZabiegowDAO = ksiegaZabiegowDAO;
    }

    @Override
    @Transactional
    public void addKsiegaZabiegow(KsiegaZabiegowDTO p) {
        KsiegaZabiegow ksiega = new KsiegaZabiegow();
        ksiega.setData(p.getData());
        ksiega.setLekarzZlec(this.pracownikDAO.getPracownikByNrPWZ(p.getNrPWZlekarzZlec().getNrPWZ()));
        ksiega.setNrKomOrg(this.szpitalDAO.getSzpitalKomOrgByNrResortowy(p.getNrKomOrg()));
        ksiega.setPacjent(this.pacjentDAO.getPacjentByPESEL(p.getPacjentPESEL()));
        ksiega.setPracownikWyk(this.pracownikDAO.getPracownikByNrPWZ(p.getNrPWZpracownikWyk().getNrPWZ()));
        ksiega.setPrzebiegZabiegu(p.getPrzebiegZabiegu());
        ksiega.setRodzajZabiegu(p.getRodzajZabiegu());
        this.ksiegaZabiegowDAO.addKsiegaZabiegow(ksiega);
    }

    @Override
    public List<KsiegaZabiegowDTO> listKsiegaZabiegow() {
        List<KsiegaZabiegow> lista = this.ksiegaZabiegowDAO.listKsiegaZabiegow();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiZabiegowDTO(lista);
    }

    @Override
    public List<KsiegaZabiegowDTO> listKsiegaZabiegowPacjenta(String pesel) {
        List<KsiegaZabiegow> lista = this.ksiegaZabiegowDAO.listKsiegaZabiegowPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiZabiegowDTO(lista);
    }
}

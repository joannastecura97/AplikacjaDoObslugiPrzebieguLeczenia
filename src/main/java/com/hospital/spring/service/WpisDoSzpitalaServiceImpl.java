/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.WpisDoSzpitalaDTO;
import com.hospital.spring.dao.HistoriaChorobyDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.WpisDoSzpitalaDAO;
import com.hospital.spring.model.KartaInformacyjna;
import com.hospital.spring.model.WpisDoSzpitala;
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
public class WpisDoSzpitalaServiceImpl implements WpisDoSzpitalaService {

    private WpisDoSzpitalaDAO wpisDoSzpitalaDAO;

    @Autowired
    private HistoriaChorobyDAO historiaChorobyDAO;

    @Autowired
    private PracownikDAO pracownikDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    public void setHistoriaChorobyDAO(HistoriaChorobyDAO historiaChorobyDAO) {
        this.historiaChorobyDAO = historiaChorobyDAO;
    }

    public void setWpisDoSzpitalaDAO(WpisDoSzpitalaDAO wpisDoSzpitalaDAO) {
        this.wpisDoSzpitalaDAO = wpisDoSzpitalaDAO;
    }

    @Override
    @Transactional
    public void addWpisDoSzpitala(WpisDoSzpitalaDTO p) {
        WpisDoSzpitala w = new WpisDoSzpitala();
        w.setDataPrzyjecia(p.getDataPrzyjecia());
        w.setHistoriaChoroby(this.historiaChorobyDAO.getHistoriaChorobyByNr(p.getHistoriaChoroby()));
        w.setLekarzKier(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarzKier().getNrPWZ()));
        w.setLekarzPrzyjm(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarzPrzyjm().getNrPWZ()));
        w.setRozpPrzezLekKier(p.getRozpPrzezLekKier());
        w.setRozpPrzezLekPrzyjm(p.getRozpPrzezLekPrzyjm());
        w.setTrybPrzyjecia(p.getTrybPrzyjecia());

        this.wpisDoSzpitalaDAO.addWpisDoSzpitala(w);
    }

    @Override
    public List<WpisDoSzpitalaDTO> listWpisDoSzpitalaPacjenta(String pesel) {

        List<WpisDoSzpitala> lista = this.wpisDoSzpitalaDAO.listWpisDoSzpitalaPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelWpisyDoszpitalaPacjentaDTO(lista);
    }
}

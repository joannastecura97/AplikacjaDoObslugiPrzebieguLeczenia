/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.WypisZeSzpitalaDTO;
import com.hospital.spring.dao.HistoriaChorobyDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.WypisZeSzpitalaDAO;
import com.hospital.spring.model.WypisZeSzpitala;
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
public class WypisZeSzpitalaServiceImpl implements WypisZeSzpitalaService {

    private WypisZeSzpitalaDAO wypisZeSzpitalaDAO;

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

    public void setWypisZeSzpitalaDAO(WypisZeSzpitalaDAO wypisZeSzpitalaDAO) {
        this.wypisZeSzpitalaDAO = wypisZeSzpitalaDAO;
    }

    @Override
    @Transactional
    public void addWypisZeSzpitala(WypisZeSzpitalaDTO p) {
        WypisZeSzpitala w = new WypisZeSzpitala();
        w.setDataWypisu(p.getDataWypisu());
        w.setEpikryza(p.getEpikryza());
        w.setHistoriaChoroby(this.historiaChorobyDAO.getHistoriaChorobyByNr(p.getHistoriaChoroby()));
        w.setLekarzWyp(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarzWyp().getNrPWZ()));
        w.setNrStatWspolistniejace(p.getNrStatWspolistniejace());
        w.setNrStatZasadnicze(p.getNrStatZasadnicze());
        w.setOpisZastLeczenia(p.getOpisZastLeczenia());
        w.setPrzyczynaWypisu(p.getPrzyczynaWypisu());
        w.setRozpoznanieKliniczne(p.getRozpoznanieKliniczne());

        if (!(p.getLekarzZg().getNrPWZ().isEmpty())) {
            w.setDawca(p.getDawca());
            w.setNrStatChorZgon(p.getNrStatChorZgon());
            w.setPrzyczynaZgonu(p.getPrzyczynaZgonu());
            w.setSekcjaZwlok(p.getSekcjaZwlok());
            w.setProtokolKom(p.getProtokolKom());
            w.setLekarzZg(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarzZg().getNrPWZ()));
            w.setDataZgonu(p.getDataZgonu());
        }
        this.wypisZeSzpitalaDAO.addWypisZeSzpitala(w);
    }

    @Override
    public List<WypisZeSzpitalaDTO> listWypisZeSzpitalaPacjenta(String pesel) {
        List<WypisZeSzpitala> lista = this.wypisZeSzpitalaDAO.listWypisZeSzpitalaPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelWypisyZeSzpitalaPacjentaDTO(lista);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.HistoriaChorobyDTO;
import com.hospital.spring.dao.HistoriaChorobyDAO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.model.HistoriaChoroby;
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
public class HistoriaChorobyServiceImpl implements HistoriaChorobyService {

    private HistoriaChorobyDAO historiaChorobyDAO;

    @Autowired
    private PacjentDAO pacjentDAO;

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }

    public void setHistoriaChorobyDAO(HistoriaChorobyDAO historiaChorobyDAO) {
        this.historiaChorobyDAO = historiaChorobyDAO;
    }

    @Override
    @Transactional
    public void addHistoriaChoroby(HistoriaChorobyDTO p) {
        HistoriaChoroby historia = new HistoriaChoroby();
        historia.setPacjent(this.pacjentDAO.getPacjentByPESEL(p.getPacjent()));
        this.historiaChorobyDAO.addHistoriaChoroby(historia);
    }

    @Override
    public List<HistoriaChorobyDTO> listHistoriaChorobPacjenta(String pesel) {
        List<HistoriaChoroby> lista = this.historiaChorobyDAO.listHistoriaChorobPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelHistoriiChorobPacjentaDTO(lista);
    }

}

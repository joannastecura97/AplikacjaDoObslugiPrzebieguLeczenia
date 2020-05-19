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
import com.hospital.spring.DTO.PrzebiegHospitalizacjiDTO;
import com.hospital.spring.dao.HistoriaChorobyDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.dao.PrzebiegHospitalizacjiDAO;
import com.hospital.spring.model.PrzebiegHospitalizacji;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hospital.spring.toolDTO.BuilderDTO;

@Transactional
@Service
public class PrzebiegHospitalizacjiServiceImpl implements PrzebiegHospitalizacjiService {

    private PrzebiegHospitalizacjiDAO przebiegHospitalizacjiDAO;

    @Autowired
    private HistoriaChorobyDAO historiaChorobyDAO;

    @Autowired
    private PracownikDAO pracownikDAO;

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    public void setHistoriaChorobyDAO(HistoriaChorobyDAO historiaChorobyDAO) {
        this.historiaChorobyDAO = historiaChorobyDAO;
    }

    public void setPrzebiegHospitalizacjiDAO(PrzebiegHospitalizacjiDAO przebiegHospitalizacjiDAO) {
        this.przebiegHospitalizacjiDAO = przebiegHospitalizacjiDAO;
    }

    @Override
    @Transactional
    public void addPrzebiegHospitalizacji(PrzebiegHospitalizacjiDTO p) {
        PrzebiegHospitalizacji w = new PrzebiegHospitalizacji();
        w.setData(p.getData());
        w.setHistoriaChoroby(this.historiaChorobyDAO.getHistoriaChorobyByNr(p.getHistoriaChoroby()));
        w.setLeczenie(p.getLeczenie());
        w.setLekarz(this.pracownikDAO.getPracownikByNrPWZ(p.getLekarz().getNrPWZ()));
        w.setPrzebiegChoroby(p.getPrzebiegChoroby());
        this.przebiegHospitalizacjiDAO.addPrzebiegHospitalizacji(w);
    }

    @Override
    public List<PrzebiegHospitalizacjiDTO> listPrzebiegHospitalizacjiPacjenta(String pesel) {
        List<PrzebiegHospitalizacji> lista = this.przebiegHospitalizacjiDAO.listPrzebiegHospitalizacjiPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelPrzebiegHospitalizacjiPacjentaDTO(lista);
    }
}

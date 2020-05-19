/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.dao.PacjentDAO;
import com.hospital.spring.model.Pacjent;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hospital.spring.toolDTO.BuilderDTO;

/**
 *
 * @author stecu
 */
@Transactional
@Service
public class PacjentServiceImpl implements PacjentService {

    private PacjentDAO pacjentDAO;

    public void setPacjentDAO(PacjentDAO pacjentDAO) {
        this.pacjentDAO = pacjentDAO;
    }

    @Override
    @Transactional
    public void addPacjent(PacjentDTO p) {
        Pacjent pacjent = new Pacjent();
        pacjent.setImie(p.getImie());
        pacjent.setDrugieImie(p.getDrugieImie());
        pacjent.setNazwisko(p.getNazwisko());
        pacjent.setPesel(p.getPesel());
        pacjent.setPlec(p.getPlec());
        pacjent.setZnakIdentyfikacyjny(p.getZnakIdentyfikacyjny());
        pacjent.setDanePrzedstawicielaUst(p.getDanePrzedstawicielaUst());
        pacjent.setDataUrodzenia(p.getDataUrodzenia());
        pacjent.setAdres(p.getAdres());
        this.pacjentDAO.addPacjent(pacjent);
    }

    @Override
    public List<PacjentDTO> listPacjents() {
        List<Pacjent> lista = this.pacjentDAO.listPacjents();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelPacjentowDTO(lista);
    }

    @Override
    public PacjentDTO getPacjentByPESEL(String id) {
        Pacjent pacjent = this.pacjentDAO.getPacjentByPESEL(id);
        if (pacjent != null) {
            BuilderDTO builder = new BuilderDTO();
            return builder.dodajPacjentDTO(pacjent);
        } else {
            return null;
        }
    }

    @Override
    public PacjentDTO getPacjentByZnakIdentyfikacyjny(String zi) {
        Pacjent pacjent = this.pacjentDAO.getPacjentByZnakIdentyfikacyjny(zi);
        if (pacjent != null) {
            BuilderDTO builder = new BuilderDTO();
            return builder.dodajPacjentDTO(pacjent);
        } else {
            return null;
        }
    }

    @Override
    public PacjentDTO getPacjentByPESELorZnakIdentyfikacyjny(String peselOrZi) {
        PacjentDTO pac = getPacjentByPESEL(peselOrZi);
        PacjentDTO pac2 = getPacjentByZnakIdentyfikacyjny(peselOrZi);
        if (pac != null) {
            return pac;
        }
        if (pac2 != null) {
            return pac2;
        } else {
            return null;
        }

    }

}

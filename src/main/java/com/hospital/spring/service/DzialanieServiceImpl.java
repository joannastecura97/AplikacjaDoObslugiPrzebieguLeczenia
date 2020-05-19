/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.DzialanieDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.dao.DzialanieDAO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.model.Dzialanie;
import static com.hospital.spring.model.Dzialanie_.pracownik;
import com.hospital.spring.model.Pracownik;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.hospital.spring.toolDTO.BuilderDTO;

/**
 *
 * @author stecu
 */
@Transactional
@Service
public class DzialanieServiceImpl implements DzialanieService {

    private DzialanieDAO dzialanieDAO;
    private PracownikService pracownikService;

    @Autowired
    private PracownikDAO pracownikDAO;

    public void setPracownikDAO(PracownikDAO pd) {
        this.pracownikDAO = pd;
    }

    public void setDzialanieDAO(DzialanieDAO dzialanieDAO) {
        this.dzialanieDAO = dzialanieDAO;
    }

    @Override
    @Transactional
    public void addDzialanie(DzialanieDTO p, String login) {
        Dzialanie dzialanie = new Dzialanie();
        dzialanie.setDataGodzina(p.getData());
        dzialanie.setOpis(p.getOpis());
        Pracownik pracownik = pracownikDAO.checkLogin(login);
        dzialanie.setPracownik(pracownik);
        this.dzialanieDAO.addDzialanie(dzialanie);
    }

    @Override
    @Transactional
    public List<DzialanieDTO> listDzialanieData(String login, Date data) {
        List<Dzialanie> lista = this.dzialanieDAO.listDzialanieData(data, login);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelDzialanDTO(lista);
    }

    @Override
    @Transactional
    public void removeDzialanie(String login, Date data) {
        this.dzialanieDAO.removeDzialanie(data, login);
    }
}

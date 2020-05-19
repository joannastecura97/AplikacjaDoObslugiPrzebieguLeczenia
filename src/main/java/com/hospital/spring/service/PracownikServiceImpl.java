/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.dao.PracownikDAO;
import com.hospital.spring.model.Pracownik;
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
public class PracownikServiceImpl implements PracownikService {

    private PracownikDAO pracownikDAO;

    public void setPracownikDAO(PracownikDAO pracownikDAO) {
        this.pracownikDAO = pracownikDAO;
    }

    @Override
    public PracownikDTO checkLogin(String login) {
        Pracownik pracownik = this.pracownikDAO.checkLogin(login);
        BuilderDTO builder = new BuilderDTO();
        return builder.wykonajPracownikDTO(pracownik);
    }
}

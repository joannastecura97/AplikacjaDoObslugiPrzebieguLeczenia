/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaRaportowPielegniarskichDTO;
import com.hospital.spring.dao.KsiegaRaportowPielegniarskichDAO;
import com.hospital.spring.model.KsiegaRaportowPielegniarskich;
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
public class KsiegaRaportowPielegniarskichServiceImpl implements KsiegaRaportowPielegniarskichService {

    private KsiegaRaportowPielegniarskichDAO ksiegaRaportowPielegniarskichDAO;

    public void setKsiegaRaportowPielegniarskichDAO(KsiegaRaportowPielegniarskichDAO ksiegaRaportowPielegniarskichDAO) {
        this.ksiegaRaportowPielegniarskichDAO = ksiegaRaportowPielegniarskichDAO;
    }

    @Override
    public List<KsiegaRaportowPielegniarskichDTO> listKsiegaRaportowPielegniarskich() {
        List<KsiegaRaportowPielegniarskich> lista = this.ksiegaRaportowPielegniarskichDAO.listKsiegaRaportowPielegniarskich();
        BuilderDTO builder = new BuilderDTO();
        return builder.modelKsiegiRaportowPielegniarskichDTO(lista);
    }

}

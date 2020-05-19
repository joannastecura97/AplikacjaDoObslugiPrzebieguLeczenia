/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.RaportPielegniarskiDTO;
import com.hospital.spring.dao.RaportPielegniarskiDAO;
import com.hospital.spring.model.RaportPielegniarski;
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
public class RaportPielegniarskiServiceImpl implements RaportPielegniarskiService {

    private RaportPielegniarskiDAO raportPielegniarskiDAO;

    public void setRaportPielegniarskiDAO(RaportPielegniarskiDAO raportPielegniarskiDAO) {
        this.raportPielegniarskiDAO = raportPielegniarskiDAO;
    }

    @Override
    public List<RaportPielegniarskiDTO> listRaportPielegniarskiPacjenta(String pesel) {
        List<RaportPielegniarski> lista = this.raportPielegniarskiDAO.listRaportPielegniarskiPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelRaportPielegniarskiPacjentaDTO(lista);
    }
}

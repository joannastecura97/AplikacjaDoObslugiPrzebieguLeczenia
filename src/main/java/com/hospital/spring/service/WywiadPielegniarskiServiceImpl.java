/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.WywiadPielegniarskiDTO;
import com.hospital.spring.dao.WywiadPielegniarskiDAO;
import com.hospital.spring.model.WywiadPielegniarski;
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
public class WywiadPielegniarskiServiceImpl implements WywiadPielegniarskiService {

    private WywiadPielegniarskiDAO wywiadPielegniarskiDAO;

    public void setWywiadPielegniarskiDAO(WywiadPielegniarskiDAO wywiadPielegniarskiDAO) {
        this.wywiadPielegniarskiDAO = wywiadPielegniarskiDAO;
    }

    @Override
    public List<WywiadPielegniarskiDTO> listWywiadPielegniarskiPacjenta(String pesel) {
        List<WywiadPielegniarski> lista = this.wywiadPielegniarskiDAO.listWywiadPielegniarskiPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelWywiadPielegniarskiPacjentaDTO(lista);
    }
}

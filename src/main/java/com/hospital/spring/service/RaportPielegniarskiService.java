/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.RaportPielegniarskiDTO;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface RaportPielegniarskiService {

    public List<RaportPielegniarskiDTO> listRaportPielegniarskiPacjenta(String pesel);
}

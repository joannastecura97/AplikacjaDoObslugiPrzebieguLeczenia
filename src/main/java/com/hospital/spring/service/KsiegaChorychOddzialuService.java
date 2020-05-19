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
import com.hospital.spring.DTO.KsiegaChorychOddzialuDTO;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import java.util.List;

public interface KsiegaChorychOddzialuService {

    public void addKsiegaChorychOddzialu(KsiegaChorychOddzialuDTO p);

    public List<KsiegaChorychOddzialuDTO> listKsiegaChorychOddzialu();
}

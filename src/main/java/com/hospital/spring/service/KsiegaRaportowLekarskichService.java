/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaRaportowLekarskichDTO;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface KsiegaRaportowLekarskichService {

    public void addKsiegaRaportowLekarskich(KsiegaRaportowLekarskichDTO p);

    public List<KsiegaRaportowLekarskichDTO> listKsiegaRaportowLekarskich();

    public List<KsiegaRaportowLekarskichDTO> listKsiegaRaportowLekarskichPacjenta(String pesel);
}

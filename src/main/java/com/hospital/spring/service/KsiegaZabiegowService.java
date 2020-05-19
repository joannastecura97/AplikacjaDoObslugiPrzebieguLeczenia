/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaZabiegowDTO;
import com.hospital.spring.model.KsiegaZabiegow;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface KsiegaZabiegowService {

    public void addKsiegaZabiegow(KsiegaZabiegowDTO p);

    public List<KsiegaZabiegowDTO> listKsiegaZabiegow();

    public List<KsiegaZabiegowDTO> listKsiegaZabiegowPacjenta(String pesel);
}

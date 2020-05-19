/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaRaportowLekarskich;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface KsiegaRaportowLekarskichDAO {

    public void addKsiegaRaportowLekarskich(KsiegaRaportowLekarskich p);

    public List<KsiegaRaportowLekarskich> listKsiegaRaportowLekarskich();

    public List<KsiegaRaportowLekarskich> listKsiegaRaportowLekarskichPacjenta(String pesel);
}

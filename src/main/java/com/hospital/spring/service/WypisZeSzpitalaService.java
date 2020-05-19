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
import com.hospital.spring.DTO.WypisZeSzpitalaDTO;
import java.util.List;

public interface WypisZeSzpitalaService {

    public void addWypisZeSzpitala(WypisZeSzpitalaDTO p);

    public List<WypisZeSzpitalaDTO> listWypisZeSzpitalaPacjenta(String pesel);
}

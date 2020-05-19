/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.WypisZeSzpitala;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface WypisZeSzpitalaDAO {

    public void addWypisZeSzpitala(WypisZeSzpitala p);

    public WypisZeSzpitala getWypisZeSzpitalaById(int id);

    public List<WypisZeSzpitala> listWypisZeSzpitalaPacjenta(String pesel);
}

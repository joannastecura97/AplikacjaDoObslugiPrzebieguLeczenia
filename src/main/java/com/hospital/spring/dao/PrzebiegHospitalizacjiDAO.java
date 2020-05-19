/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.PrzebiegHospitalizacji;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface PrzebiegHospitalizacjiDAO {

    public void addPrzebiegHospitalizacji(PrzebiegHospitalizacji p);

    public List<PrzebiegHospitalizacji> listPrzebiegHospitalizacji();

    public List<PrzebiegHospitalizacji> listPrzebiegHospitalizacjiPacjenta(String pesel);
}

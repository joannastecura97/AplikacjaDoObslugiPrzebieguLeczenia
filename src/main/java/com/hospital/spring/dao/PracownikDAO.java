/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.Pracownik;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface PracownikDAO {

    public Pracownik getPracownikByNrPWZ(String nrPWZ);

    public Pracownik checkLogin(String login);
}

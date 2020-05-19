/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.model.Pracownik;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface PracownikService {

    public PracownikDTO checkLogin(String login);
}

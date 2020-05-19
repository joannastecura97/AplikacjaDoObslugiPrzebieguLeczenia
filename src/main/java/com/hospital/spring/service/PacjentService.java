/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.model.Pacjent;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface PacjentService {

    public void addPacjent(PacjentDTO p);

    public List<PacjentDTO> listPacjents();

    public PacjentDTO getPacjentByPESEL(String pesel);

    public PacjentDTO getPacjentByZnakIdentyfikacyjny(String zi);

    public PacjentDTO getPacjentByPESELorZnakIdentyfikacyjny(String pId);
}

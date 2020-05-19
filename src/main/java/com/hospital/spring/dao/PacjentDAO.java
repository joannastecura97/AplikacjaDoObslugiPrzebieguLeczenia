/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.Pacjent;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface PacjentDAO {

    public void addPacjent(Pacjent p);

    public List<Pacjent> listPacjents();

    public Pacjent getPacjentByPESEL(String pesel);

    public Pacjent getPacjentByZnakIdentyfikacyjny(String zi);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.DTO.DzialanieDTO;
import com.hospital.spring.model.Dzialanie;
import java.util.Date;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface DzialanieDAO {

    public void addDzialanie(Dzialanie p);

    public List<Dzialanie> listDzialanieData(Date d, String pracownikLogin);

    public void removeDzialanie(Date d, String pracownikLogin);

}

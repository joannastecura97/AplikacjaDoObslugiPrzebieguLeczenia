/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.service;

import com.hospital.spring.DTO.DzialanieDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.model.Dzialanie;
import java.util.Date;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface DzialanieService {

    public void addDzialanie(DzialanieDTO p, String login);

    public List<DzialanieDTO> listDzialanieData(String login, Date data);

    public void removeDzialanie(String login, Date data);
}

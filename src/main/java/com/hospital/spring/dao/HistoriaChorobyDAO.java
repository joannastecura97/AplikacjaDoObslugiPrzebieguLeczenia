/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.HistoriaChoroby;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface HistoriaChorobyDAO {

    public void addHistoriaChoroby(HistoriaChoroby p);

    public List<HistoriaChoroby> listHistoriaChorob();

    public List<HistoriaChoroby> listHistoriaChorobPacjenta(String pesel);

    public HistoriaChoroby getHistoriaChorobyByNr(int id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

/**
 *
 * @author stecu
 */
import com.hospital.spring.model.KsiegaChorychOddzialu;
import java.util.List;

public interface KsiegaChorychOddzialuDAO {

    public void addKsiegaChorychOddzialu(KsiegaChorychOddzialu p);

    public List<KsiegaChorychOddzialu> listKsiegaChorychOddzialu();

    public KsiegaChorychOddzialu getKsiegaChorychOddzialuById(int id);
}

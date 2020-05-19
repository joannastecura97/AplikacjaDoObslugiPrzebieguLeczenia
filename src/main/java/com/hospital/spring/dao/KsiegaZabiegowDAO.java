/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaZabiegow;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface KsiegaZabiegowDAO {

    public void addKsiegaZabiegow(KsiegaZabiegow p);

    public List<KsiegaZabiegow> listKsiegaZabiegow();

    public List<KsiegaZabiegow> listKsiegaZabiegowPacjenta(String pesel);
}

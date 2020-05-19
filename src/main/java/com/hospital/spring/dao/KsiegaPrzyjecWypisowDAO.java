/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import java.util.List;

/**
 *
 * @author stecu
 */
public interface KsiegaPrzyjecWypisowDAO {

    public void addKsiegaPrzyjecWypisow(KsiegaPrzyjecWypisow p);

    public List<KsiegaPrzyjecWypisow> listKsiegaPrzyjecWypisow();

    public KsiegaPrzyjecWypisow getKsiegaPrzyjecWypisowById(int id);

}

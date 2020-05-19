package com.hospital.spring.service;

import com.hospital.spring.DTO.KsiegaPrzyjecWypisowDTO;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stecu
 */
public interface KsiegaPrzyjecWypisowService {

    public void addKsiegaPrzyjecWypisow(KsiegaPrzyjecWypisowDTO p);

    public List<KsiegaPrzyjecWypisowDTO> listKsiegaPrzyjecWypisow();
}

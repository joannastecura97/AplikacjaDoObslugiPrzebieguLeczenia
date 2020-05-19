package com.hospital.spring.dao;

import java.util.List;

import com.hospital.spring.model.OsobaUpowazniona;

public interface OsobaUpowaznionaDAO {

    public void addOsobaUpowazniona(OsobaUpowazniona p);

    public void removeOsobaUpowazniona(String tel);

    public List<OsobaUpowazniona> listOsobaUpowaznionaPacjenta(String pesel);
}

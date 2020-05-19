package com.hospital.spring.service;

import com.hospital.spring.DTO.OsobaUpowaznionaDTO;
import java.util.List;

public interface OsobaUpowaznionaService {

    public void addOsobaUpowazniona(OsobaUpowaznionaDTO p);

    public void removeOsobaUpowazniona(String tel);

    public List<OsobaUpowaznionaDTO> listOsobaUpowaznionaPacjenta(String pesel);
}

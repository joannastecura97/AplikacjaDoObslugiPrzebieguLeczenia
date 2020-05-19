package com.hospital.spring.service;

import com.hospital.spring.DTO.OsobaUpowaznionaDTO;
import com.hospital.spring.dao.HistoriaChorobyDAO;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.spring.dao.OsobaUpowaznionaDAO;
import com.hospital.spring.model.OsobaUpowazniona;
import org.springframework.beans.factory.annotation.Autowired;
import com.hospital.spring.toolDTO.BuilderDTO;

@Transactional
@Service
public class OsobaUpowaznionaServiceImpl implements OsobaUpowaznionaService {

    private OsobaUpowaznionaDAO osobaUpowaznionaDAO;

    @Autowired
    private HistoriaChorobyDAO historiaChorobyDAO;

    public void setHistoriaChorobyDAO(HistoriaChorobyDAO historiaChorobyDAO) {
        this.historiaChorobyDAO = historiaChorobyDAO;
    }

    public void setOsobaUpowaznionaDAO(OsobaUpowaznionaDAO osobaUpowaznionaDAO) {
        this.osobaUpowaznionaDAO = osobaUpowaznionaDAO;
    }

    @Override
    @Transactional
    public void addOsobaUpowazniona(OsobaUpowaznionaDTO p) {
        OsobaUpowazniona o = new OsobaUpowazniona();
        o.setAdres(p.getAdres());
        o.setHistoriaChoroby(this.historiaChorobyDAO.getHistoriaChorobyByNr(p.getHistoriaChoroby()));
        o.setImie(p.getImie());
        o.setNazwisko(p.getNazwisko());
        o.setNrTelefonu(p.getNrTelefonu());
        this.osobaUpowaznionaDAO.addOsobaUpowazniona(o);
    }

    @Override
    @Transactional
    public void removeOsobaUpowazniona(String tel) {
        this.osobaUpowaznionaDAO.removeOsobaUpowazniona(tel);
    }

    @Override
    @Transactional
    public List<OsobaUpowaznionaDTO> listOsobaUpowaznionaPacjenta(String pesel) {
        List<OsobaUpowazniona> lista = this.osobaUpowaznionaDAO.listOsobaUpowaznionaPacjenta(pesel);
        BuilderDTO builder = new BuilderDTO();
        return builder.modelOsobUpowaznionychPacjentaDTO(lista);
    }

}

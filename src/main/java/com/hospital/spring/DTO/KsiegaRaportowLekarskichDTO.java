/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.DTO;

import java.util.Date;

/**
 *
 * @author stecu
 */
public class KsiegaRaportowLekarskichDTO {

    private int nrWKsiedze;
    private Date data;
    private String sprawozdanie;
    private String nrKomOrg;
    private String pacjent;
    private PracownikDTO lekarz;

    public int getNrWKsiedze() {
        return nrWKsiedze;
    }

    public void setNrWKsiedze(int nr) {
        this.nrWKsiedze = nr;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSprawozdanie() {
        return sprawozdanie;
    }

    public void setSprawozdanie(String sprawozdanie) {
        this.sprawozdanie = sprawozdanie;
    }

    public String getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(String nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public String getPacjent() {
        return pacjent;
    }

    public void setPacjent(String pacjent) {
        this.pacjent = pacjent;
    }

    public PracownikDTO getLekarz() {
        return lekarz;
    }

    public void setLekarz(PracownikDTO lekarz) {
        this.lekarz = lekarz;
    }

}

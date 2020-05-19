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
public class RaportPielegniarskiDTO {

    String nazwaKomOrg;
    Date data;
    PracownikDTO pelegniarka;

    public String getNazwaKomOrg() {
        return nazwaKomOrg;
    }

    public void setNazwaKomOrg(String nazwaKomOrg) {
        this.nazwaKomOrg = nazwaKomOrg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public PracownikDTO getPelegniarka() {
        return pelegniarka;
    }

    public void setPelegniarka(PracownikDTO pelegniarka) {
        this.pelegniarka = pelegniarka;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.DTO;

/**
 *
 * @author stecu
 */
public class WywiadPielegniarskiDTO {

    int historiaChoroby;
    String nazwaKomOrg;
    PracownikDTO pelegniarka;

    public int getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(int historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

    public String getNazwaKomOrg() {
        return nazwaKomOrg;
    }

    public void setNazwaKomOrg(String nazwaKomOrg) {
        this.nazwaKomOrg = nazwaKomOrg;
    }

    public PracownikDTO getPelegniarka() {
        return pelegniarka;
    }

    public void setPelegniarka(PracownikDTO pelegniarka) {
        this.pelegniarka = pelegniarka;
    }

}

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
public class WpisDoSzpitalaDTO {

    private Integer nr;
    private String trybPrzyjecia;
    private Date dataPrzyjecia;
    private String rozpPrzezLekKier;
    private String rozpPrzezLekPrzyjm;
    private PracownikDTO lekarzKier;
    private PracownikDTO lekarzPrzyjm;
    private int historiaChoroby;

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public int getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(int historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

    public PracownikDTO getLekarzKier() {
        return lekarzKier;
    }

    public void setLekarzKier(PracownikDTO lekarzKier) {
        this.lekarzKier = lekarzKier;
    }

    public PracownikDTO getLekarzPrzyjm() {
        return lekarzPrzyjm;
    }

    public void setLekarzPrzyjm(PracownikDTO lekarzPrzyjm) {
        this.lekarzPrzyjm = lekarzPrzyjm;
    }

    public String getTrybPrzyjecia() {
        return trybPrzyjecia;
    }

    public void setTrybPrzyjecia(String trybPrzyjecia) {
        this.trybPrzyjecia = trybPrzyjecia;
    }

    public Date getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(Date dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }

    public String getRozpPrzezLekKier() {
        return rozpPrzezLekKier;
    }

    public void setRozpPrzezLekKier(String rozpPrzezLekKier) {
        this.rozpPrzezLekKier = rozpPrzezLekKier;
    }

    public String getRozpPrzezLekPrzyjm() {
        return rozpPrzezLekPrzyjm;
    }

    public void setRozpPrzezLekPrzyjm(String rozpPrzezLekPrzyjm) {
        this.rozpPrzezLekPrzyjm = rozpPrzezLekPrzyjm;
    }

}

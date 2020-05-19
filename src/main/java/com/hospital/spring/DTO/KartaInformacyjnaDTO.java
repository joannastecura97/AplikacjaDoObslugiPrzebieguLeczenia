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
public class KartaInformacyjnaDTO {

    private Date dataWydania;
    private String rozpoznania;
    private String wynikiBadan;
    private String leczenie;
    private String epikryza;
    private String zalecenia;
    private String okresNiezdolnosci;
    private String leki;
    private String nrKomOrg;
    private PracownikDTO nrPwzLekarz;
    private String pacjent;

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    public String getRozpoznania() {
        return rozpoznania;
    }

    public void setRozpoznania(String rozpoznania) {
        this.rozpoznania = rozpoznania;
    }

    public String getWynikiBadan() {
        return wynikiBadan;
    }

    public void setWynikiBadan(String wynikiBadan) {
        this.wynikiBadan = wynikiBadan;
    }

    public String getLeczenie() {
        return leczenie;
    }

    public void setLeczenie(String leczenie) {
        this.leczenie = leczenie;
    }

    public String getEpikryza() {
        return epikryza;
    }

    public void setEpikryza(String epikryza) {
        this.epikryza = epikryza;
    }

    public String getZalecenia() {
        return zalecenia;
    }

    public void setZalecenia(String zalecenia) {
        this.zalecenia = zalecenia;
    }

    public String getOkresNiezdolnosci() {
        return okresNiezdolnosci;
    }

    public void setOkresNiezdolnosci(String okresNiezdolnosci) {
        this.okresNiezdolnosci = okresNiezdolnosci;
    }

    public String getLeki() {
        return leki;
    }

    public void setLeki(String leki) {
        this.leki = leki;
    }

    public String getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(String nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public PracownikDTO getNrPwzLekarz() {
        return nrPwzLekarz;
    }

    public void setNrPwzLekarz(PracownikDTO nrPwzLekarz) {
        this.nrPwzLekarz = nrPwzLekarz;
    }

    public String getPacjent() {
        return pacjent;
    }

    public void setPacjent(String pacjent) {
        this.pacjent = pacjent;
    }

}

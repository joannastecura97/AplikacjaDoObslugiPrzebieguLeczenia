/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.DTO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.validation.constraints.Size;

/**
 *
 * @author stecu
 */
public class PacjentDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String znakIdentyfikacyjny;
    private String imie;
    private String drugieImie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String plec;
    private String adres;
    private String pesel;
    private String danePrzedstawicielaUst;

    public String getZnakIdentyfikacyjny() {
        return znakIdentyfikacyjny;
    }

    public void setZnakIdentyfikacyjny(String znakIdentyfikacyjny) {
        this.znakIdentyfikacyjny = znakIdentyfikacyjny;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getDrugieImie() {
        return drugieImie;
    }

    public void setDrugieImie(String drugieImie) {
        this.drugieImie = drugieImie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDanePrzedstawicielaUst() {
        return danePrzedstawicielaUst;
    }

    public void setDanePrzedstawicielaUst(String danePrzedstawicielaUst) {
        this.danePrzedstawicielaUst = danePrzedstawicielaUst;
    }

}

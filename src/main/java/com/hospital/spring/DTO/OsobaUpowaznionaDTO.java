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
public class OsobaUpowaznionaDTO {

    private String imie;
    private String nazwisko;
    private String adres;
    private String nrTelefonu;
    private int historiaChoroby;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public int getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(int historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

}

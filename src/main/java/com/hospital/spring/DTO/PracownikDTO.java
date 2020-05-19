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
public class PracownikDTO {

    String login;
    String imie;
    String nazwisko;
    String nrPWZ;
    String tytulZawodowy;

    public String getTytulZawodowy() {
        return tytulZawodowy;
    }

    public void setTytulZawodowy(String tytulZawodowy) {
        this.tytulZawodowy = tytulZawodowy;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    public String getNrPWZ() {
        return nrPWZ;
    }

    public void setNrPWZ(String nrPWZ) {
        this.nrPWZ = nrPWZ;
    }

}

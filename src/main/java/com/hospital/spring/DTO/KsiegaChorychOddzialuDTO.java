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
public class KsiegaChorychOddzialuDTO {

    private int nrWKsiedze;
    private PracownikDTO lekarzProw;
    private String nrKomOrg;
    private String pesel;
    private int nrKsiegaPrzyjec;

    public int getNrWKsiedze() {
        return nrWKsiedze;
    }

    public void setNrWKsiedze(int nrWKsiedze) {
        this.nrWKsiedze = nrWKsiedze;
    }

    public PracownikDTO getLekarzProw() {
        return lekarzProw;
    }

    public void setLekarzProw(PracownikDTO lekarzProw) {
        this.lekarzProw = lekarzProw;
    }

    public String getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(String nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getNrKsiegaPrzyjec() {
        return nrKsiegaPrzyjec;
    }

    public void setNrKsiegaPrzyjec(int nrKsiegaPrzyjec) {
        this.nrKsiegaPrzyjec = nrKsiegaPrzyjec;
    }

}

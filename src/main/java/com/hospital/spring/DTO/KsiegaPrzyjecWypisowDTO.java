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
public class KsiegaPrzyjecWypisowDTO {

    private int nrWKsiedze;
    private String rozpOnkologiczne;
    private String miejsceGdzieZostalWypisany;
    private String transportSanitarny;
    private String okolicznosciTr;
    private String pobranieOplat;
    private String nrKartyDepozytowej;
    private String pesel;
    private int nrWpisu;
    private int nrWypisu;
    private String nrResortowyKom;
    private PracownikDTO nrPwzLekarz;

    public int getNrWKsiedze() {
        return nrWKsiedze;
    }

    public void setNrWKsiedze(int nrWKsiedze) {
        this.nrWKsiedze = nrWKsiedze;
    }

    public String getRozpOnkologiczne() {
        return rozpOnkologiczne;
    }

    public void setRozpOnkologiczne(String rozpOnkologiczne) {
        this.rozpOnkologiczne = rozpOnkologiczne;
    }

    public String getMiejsceGdzieZostalWypisany() {
        return miejsceGdzieZostalWypisany;
    }

    public void setMiejsceGdzieZostalWypisany(String miejsceGdzieZostalWypisany) {
        this.miejsceGdzieZostalWypisany = miejsceGdzieZostalWypisany;
    }

    public String getTransportSanitarny() {
        return transportSanitarny;
    }

    public void setTransportSanitarny(String transportSanitarny) {
        this.transportSanitarny = transportSanitarny;
    }

    public String getOkolicznosciTr() {
        return okolicznosciTr;
    }

    public void setOkolicznosciTr(String okolicznosciTr) {
        this.okolicznosciTr = okolicznosciTr;
    }

    public String getPobranieOplat() {
        return pobranieOplat;
    }

    public void setPobranieOplat(String pobranieOplat) {
        this.pobranieOplat = pobranieOplat;
    }

    public String getNrKartyDepozytowej() {
        return nrKartyDepozytowej;
    }

    public void setNrKartyDepozytowej(String nrKartyDepozytowej) {
        this.nrKartyDepozytowej = nrKartyDepozytowej;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getNrWpisu() {
        return nrWpisu;
    }

    public void setNrWpisu(int nrWpisu) {
        this.nrWpisu = nrWpisu;
    }

    public int getNrWypisu() {
        return nrWypisu;
    }

    public void setNrWypisu(int nrWypisu) {
        this.nrWypisu = nrWypisu;
    }

    public String getNrResortowyKom() {
        return nrResortowyKom;
    }

    public void setNrResortowyKom(String nrResortowyKom) {
        this.nrResortowyKom = nrResortowyKom;
    }

    public PracownikDTO getNrPwzLekarz() {
        return nrPwzLekarz;
    }

    public void setNrPwzLekarz(PracownikDTO nrPwzLekarz) {
        this.nrPwzLekarz = nrPwzLekarz;
    }

}

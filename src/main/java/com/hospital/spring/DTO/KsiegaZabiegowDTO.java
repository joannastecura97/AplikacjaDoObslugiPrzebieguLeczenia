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
public class KsiegaZabiegowDTO {

    private int nrWKsiedze;
    private Date data;
    private String rodzajZabiegu;
    private String przebiegZabiegu;
    private PracownikDTO nrPWZlekarzZlec;
    private String nrKomOrg;
    private PracownikDTO nrPWZpracownikWyk;
    private String pacjentPESEL;

    public int getNrWKsiedze() {
        return nrWKsiedze;
    }

    public void setNrWKsiedze(int nrWKsiedze) {
        this.nrWKsiedze = nrWKsiedze;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRodzajZabiegu() {
        return rodzajZabiegu;
    }

    public void setRodzajZabiegu(String rodzajZabiegu) {
        this.rodzajZabiegu = rodzajZabiegu;
    }

    public String getPrzebiegZabiegu() {
        return przebiegZabiegu;
    }

    public void setPrzebiegZabiegu(String przebiegZabiegu) {
        this.przebiegZabiegu = przebiegZabiegu;
    }

    public PracownikDTO getNrPWZlekarzZlec() {
        return nrPWZlekarzZlec;
    }

    public void setNrPWZlekarzZlec(PracownikDTO nrPWZlekarzZlec) {
        this.nrPWZlekarzZlec = nrPWZlekarzZlec;
    }

    public String getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(String nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public PracownikDTO getNrPWZpracownikWyk() {
        return nrPWZpracownikWyk;
    }

    public void setNrPWZpracownikWyk(PracownikDTO nrPWZpracownikWyk) {
        this.nrPWZpracownikWyk = nrPWZpracownikWyk;
    }

    public String getPacjentPESEL() {
        return pacjentPESEL;
    }

    public void setPacjentPESEL(String pacjentPESEL) {
        this.pacjentPESEL = pacjentPESEL;
    }

}

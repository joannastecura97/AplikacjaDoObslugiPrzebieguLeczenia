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
public class WypisZeSzpitalaDTO {

    private int nr;
    private String rozpoznanieKliniczne;
    private String nrStatZasadnicze;
    private String nrStatWspolistniejace;
    private String opisZastLeczenia;
    private String epikryza;
    private String przyczynaWypisu;
    private Date dataWypisu;
    private Date dataZgonu;
    private String przyczynaZgonu;
    private String nrStatChorZgon;
    private String protokolKom;
    private String sekcjaZwlok;
    private String dawca;
    private PracownikDTO lekarzWyp;
    private PracownikDTO lekarzZg;
    private int historiaChoroby;

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getRozpoznanieKliniczne() {
        return rozpoznanieKliniczne;
    }

    public void setRozpoznanieKliniczne(String rozpoznanieKliniczne) {
        this.rozpoznanieKliniczne = rozpoznanieKliniczne;
    }

    public String getNrStatZasadnicze() {
        return nrStatZasadnicze;
    }

    public void setNrStatZasadnicze(String nrStatZasadnicze) {
        this.nrStatZasadnicze = nrStatZasadnicze;
    }

    public String getNrStatWspolistniejace() {
        return nrStatWspolistniejace;
    }

    public void setNrStatWspolistniejace(String nrStatWspolistniejace) {
        this.nrStatWspolistniejace = nrStatWspolistniejace;
    }

    public String getOpisZastLeczenia() {
        return opisZastLeczenia;
    }

    public void setOpisZastLeczenia(String opisZastLeczenia) {
        this.opisZastLeczenia = opisZastLeczenia;
    }

    public String getEpikryza() {
        return epikryza;
    }

    public void setEpikryza(String epikryza) {
        this.epikryza = epikryza;
    }

    public String getPrzyczynaWypisu() {
        return przyczynaWypisu;
    }

    public void setPrzyczynaWypisu(String przyczynaWypisu) {
        this.przyczynaWypisu = przyczynaWypisu;
    }

    public Date getDataWypisu() {
        return dataWypisu;
    }

    public void setDataWypisu(Date dataWypisu) {
        this.dataWypisu = dataWypisu;
    }

    public Date getDataZgonu() {
        return dataZgonu;
    }

    public void setDataZgonu(Date dataZgonu) {
        this.dataZgonu = dataZgonu;
    }

    public String getPrzyczynaZgonu() {
        return przyczynaZgonu;
    }

    public void setPrzyczynaZgonu(String przyczynaZgonu) {
        this.przyczynaZgonu = przyczynaZgonu;
    }

    public String getNrStatChorZgon() {
        return nrStatChorZgon;
    }

    public void setNrStatChorZgon(String nrStatChorZgon) {
        this.nrStatChorZgon = nrStatChorZgon;
    }

    public String getProtokolKom() {
        return protokolKom;
    }

    public void setProtokolKom(String protokolKom) {
        this.protokolKom = protokolKom;
    }

    public String getSekcjaZwlok() {
        return sekcjaZwlok;
    }

    public void setSekcjaZwlok(String sekcjaZwlok) {
        this.sekcjaZwlok = sekcjaZwlok;
    }

    public String getDawca() {
        return dawca;
    }

    public void setDawca(String dawca) {
        this.dawca = dawca;
    }

    public PracownikDTO getLekarzWyp() {
        return lekarzWyp;
    }

    public void setLekarzWyp(PracownikDTO lekarzWyp) {
        this.lekarzWyp = lekarzWyp;
    }

    public PracownikDTO getLekarzZg() {
        return lekarzZg;
    }

    public void setLekarzZg(PracownikDTO lekarzZg) {
        this.lekarzZg = lekarzZg;
    }

    public int getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(int historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

}

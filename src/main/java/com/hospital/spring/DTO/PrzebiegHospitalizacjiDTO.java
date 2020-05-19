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
public class PrzebiegHospitalizacjiDTO {

    private Date data;
    private String przebiegChoroby;
    private String leczenie;
    private PracownikDTO lekarz;
    private int historiaChoroby;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPrzebiegChoroby() {
        return przebiegChoroby;
    }

    public void setPrzebiegChoroby(String przebiegChoroby) {
        this.przebiegChoroby = przebiegChoroby;
    }

    public String getLeczenie() {
        return leczenie;
    }

    public void setLeczenie(String leczenie) {
        this.leczenie = leczenie;
    }

    public PracownikDTO getLekarz() {
        return lekarz;
    }

    public void setLekarz(PracownikDTO lekarz) {
        this.lekarz = lekarz;
    }

    public int getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(int historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

}

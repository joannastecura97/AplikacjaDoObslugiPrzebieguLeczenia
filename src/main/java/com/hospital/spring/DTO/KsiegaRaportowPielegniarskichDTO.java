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
public class KsiegaRaportowPielegniarskichDTO {

    private int nrWpisu;
    private Date data;
    private int osobyPrzyjete;
    private int osobyWypisane;
    private int osobyZmarle;
    private PracownikDTO pielegniarka;

    public Integer getNrWpisu() {
        return nrWpisu;
    }

    public void setNrWpisu(int nrWpisu) {
        this.nrWpisu = nrWpisu;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getOsobyPrzyjete() {
        return osobyPrzyjete;
    }

    public void setOsobyPrzyjete(int osobyPrzyjete) {
        this.osobyPrzyjete = osobyPrzyjete;
    }

    public int getOsobyWypisane() {
        return osobyWypisane;
    }

    public void setOsobyWypisane(int osobyWypisane) {
        this.osobyWypisane = osobyWypisane;
    }

    public int getOsobyZmarle() {
        return osobyZmarle;
    }

    public void setOsobyZmarle(int osobyZmarle) {
        this.osobyZmarle = osobyZmarle;
    }

    public PracownikDTO getPielegniarka() {
        return pielegniarka;
    }

    public void setPielegniarka(PracownikDTO pielegniarka) {
        this.pielegniarka = pielegniarka;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.DTO;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author stecu
 */
public class DzialanieDTO {

    String opis;
    Date data;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}

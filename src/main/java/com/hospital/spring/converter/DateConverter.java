/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stecu
 */
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String element) {
        SimpleDateFormat formaDate;
        if (element.length() > 16) {
            formaDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            System.out.println(element);
        } else if (element.length() > 10) {
            formaDate = new SimpleDateFormat("MM/dd/yyyy hh:mm");
        } else {
            formaDate = new SimpleDateFormat("MM/dd/yyyy");
        }

        try {
            return formaDate.parse(element);
        } catch (ParseException ex) {
            Logger.getLogger(DateConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}

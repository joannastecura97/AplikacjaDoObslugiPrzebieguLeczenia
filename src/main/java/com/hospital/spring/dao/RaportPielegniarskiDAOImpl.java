/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import org.springframework.stereotype.Repository;

import com.hospital.spring.model.RaportPielegniarski;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stecu
 */

@Repository
public class RaportPielegniarskiDAOImpl implements RaportPielegniarskiDAO {

    private static final Logger logger = LoggerFactory.getLogger(RaportPielegniarskiDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public List<RaportPielegniarski> listRaportPielegniarskiPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from RaportPielegniarski as h where h.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<RaportPielegniarski> raportPielegniarskiList = query.list();

        return raportPielegniarskiList;
    }
}

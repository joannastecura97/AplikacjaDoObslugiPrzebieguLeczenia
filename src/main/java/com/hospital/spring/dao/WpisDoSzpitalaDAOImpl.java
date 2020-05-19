/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.WpisDoSzpitala;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stecu
 */
@Repository
public class WpisDoSzpitalaDAOImpl implements WpisDoSzpitalaDAO {

    private static final Logger logger = LoggerFactory.getLogger(WpisDoSzpitalaDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addWpisDoSzpitala(WpisDoSzpitala p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("WpisDoSzpitala saved successfully, WpisDoSzpitala Details=" + p);
    }

    @Override
    public WpisDoSzpitala getWpisDoSzpitalaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        WpisDoSzpitala p = (WpisDoSzpitala) session.load(WpisDoSzpitala.class, new Integer(id));
        logger.info("Person loaded successfully, Person details=" + p);
        return p;
    }

    @Override
    public List<WpisDoSzpitala> listWpisDoSzpitalaPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from WpisDoSzpitala as h where h.historiaChoroby.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<WpisDoSzpitala> wpisDoSzpitalaList = query.list();

        return wpisDoSzpitalaList;
    }

}

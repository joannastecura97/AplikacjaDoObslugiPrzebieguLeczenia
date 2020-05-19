/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.WypisZeSzpitala;
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
public class WypisZeSzpitalaDAOImpl implements WypisZeSzpitalaDAO {

    private static final Logger logger = LoggerFactory.getLogger(WypisZeSzpitalaDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addWypisZeSzpitala(WypisZeSzpitala p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("WypisZeSzpitala saved successfully, WypisZeSzpitala Details=" + p);
    }

    @Override
    public WypisZeSzpitala getWypisZeSzpitalaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        WypisZeSzpitala p = (WypisZeSzpitala) session.load(WypisZeSzpitala.class, new Integer(id));
        logger.info("WypisZeSzpitala loaded successfully, WypisZeSzpitala details=" + p);
        return p;
    }

    @Override
    public List<WypisZeSzpitala> listWypisZeSzpitalaPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from WypisZeSzpitala as h where h.historiaChoroby.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<WypisZeSzpitala> wypisZeSzpitalaList = query.list();

        return wypisZeSzpitalaList;
    }
}

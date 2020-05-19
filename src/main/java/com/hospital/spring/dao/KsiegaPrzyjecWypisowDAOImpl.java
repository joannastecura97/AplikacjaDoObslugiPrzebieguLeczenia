/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import java.util.List;
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
public class KsiegaPrzyjecWypisowDAOImpl implements KsiegaPrzyjecWypisowDAO {

    private static final Logger logger = LoggerFactory.getLogger(KsiegaPrzyjecWypisowDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addKsiegaPrzyjecWypisow(KsiegaPrzyjecWypisow p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("WypisZeSzpitala saved successfully, WypisZeSzpitala Details=" + p);
    }

    @Override
    public List<KsiegaPrzyjecWypisow> listKsiegaPrzyjecWypisow() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowList = session.createQuery("from KsiegaPrzyjecWypisow").list();
        for (KsiegaPrzyjecWypisow p : ksiegaPrzyjecWypisowList) {
            logger.info("KsiegaPrzyjecWypisow List::" + p);
        }
        return ksiegaPrzyjecWypisowList;
    }

    @Override
    public KsiegaPrzyjecWypisow getKsiegaPrzyjecWypisowById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        KsiegaPrzyjecWypisow p = (KsiegaPrzyjecWypisow) session.load(KsiegaPrzyjecWypisow.class, new Integer(id));
        logger.info("KsiegaPrzyjecWypisow loaded successfully, KsiegaPrzyjecWypisow details=" + p);
        return p;
    }
}

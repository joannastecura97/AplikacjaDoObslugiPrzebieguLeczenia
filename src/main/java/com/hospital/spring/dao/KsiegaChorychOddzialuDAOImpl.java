/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaChorychOddzialu;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stecu
 */
@Repository
public class KsiegaChorychOddzialuDAOImpl implements KsiegaChorychOddzialuDAO {

    private static final Logger logger = LoggerFactory.getLogger(KsiegaChorychOddzialuDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addKsiegaChorychOddzialu(KsiegaChorychOddzialu p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("KsiegaChorychOddzialu saved successfully, KsiegaChorychOddzialu Details=" + p);
    }

    @Override
    public List<KsiegaChorychOddzialu> listKsiegaChorychOddzialu() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KsiegaChorychOddzialu> ksiegaChorychOddzialuList = session.createQuery("from KsiegaChorychOddzialu").list();
        for (KsiegaChorychOddzialu p : ksiegaChorychOddzialuList) {
            logger.info("KsiegaChorychOddzialu List::" + p);
        }
        return ksiegaChorychOddzialuList;
    }

    @Override
    public KsiegaChorychOddzialu getKsiegaChorychOddzialuById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        KsiegaChorychOddzialu p = (KsiegaChorychOddzialu) session.load(KsiegaChorychOddzialu.class, new Integer(id));
        logger.info("KsiegaChorychOddzialu loaded successfully, KsiegaChorychOddzialu details=" + p);
        return p;
    }

}

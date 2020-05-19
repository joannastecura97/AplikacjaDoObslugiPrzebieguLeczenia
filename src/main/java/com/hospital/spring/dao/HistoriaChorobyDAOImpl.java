/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.HistoriaChoroby;
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
public class HistoriaChorobyDAOImpl implements HistoriaChorobyDAO {

    private static final Logger logger = LoggerFactory.getLogger(HistoriaChorobyDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addHistoriaChoroby(HistoriaChoroby p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Pacjent saved successfully, Pacjent Details=" + p);
    }

    @Override
    public List<HistoriaChoroby> listHistoriaChorob() {
        Session session = this.sessionFactory.getCurrentSession();
        List<HistoriaChoroby> historiaChorobyList = session.createQuery("from HistoriaChoroby").list();
        for (HistoriaChoroby p : historiaChorobyList) {
            logger.info("HistoriaChoroby List::" + p);
        }
        return historiaChorobyList;
    }

    @Override
    public List<HistoriaChoroby> listHistoriaChorobPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from HistoriaChoroby as h where h.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<HistoriaChoroby> historiaChorobyList = query.list();

        return historiaChorobyList;
    }

    @Override
    public HistoriaChoroby getHistoriaChorobyByNr(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        HistoriaChoroby p = (HistoriaChoroby) session.load(HistoriaChoroby.class, new Integer(id));
        logger.info("Person loaded successfully, Person details=" + p);
        return p;
    }

}

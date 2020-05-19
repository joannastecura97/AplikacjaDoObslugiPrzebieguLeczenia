/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.Pacjent;
import java.util.List;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stecu
 */
@Repository
public class PacjentDAOImpl implements PacjentDAO {

    private static final Logger logger = LoggerFactory.getLogger(PacjentDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addPacjent(Pacjent p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Pacjent saved successfully, Pacjent Details=" + p);
    }

    @Override
    public List<Pacjent> listPacjents() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Pacjent> personsList = session.createQuery("from Pacjent").list();
        for (Pacjent p : personsList) {
            logger.info("Pacjent List::" + p);
        }
        return personsList;
    }

    @Override
    public Pacjent getPacjentByPESEL(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        try {
            Pacjent p = (Pacjent) session.load(Pacjent.class, new String(pesel));
            logger.info("Person loaded successfully, Person details=" + p);
            return p;
        } catch (ObjectNotFoundException e) {
            return null;
        }

    }

    @Override
    public Pacjent getPacjentByZnakIdentyfikacyjny(String zi) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Pacjent as p where p.znakIdentyfikacyjny=?");
        query.setParameter(0, zi);
        List<Pacjent> list = query.list();

        if ((list != null) && (list.size() > 0)) {
            return list.get(0);
        }

        return null;
    }

}

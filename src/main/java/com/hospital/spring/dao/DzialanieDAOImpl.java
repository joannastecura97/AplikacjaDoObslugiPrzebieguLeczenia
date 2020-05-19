/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.hospital.spring.model.Dzialanie;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author stecu
 */
@Repository
public class DzialanieDAOImpl implements DzialanieDAO {

    private static final Logger logger = LoggerFactory.getLogger(DzialanieDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addDzialanie(Dzialanie p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);

        logger.info("Dzialanie saved successfully, Dzialanie Details=" + p);
    }

    @Override
    public List<Dzialanie> listDzialanieData(Date data, String pracownikLogin) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Dzialanie where DATE(dataGodzina)= ? and pracownik.login=?");
        query.setDate(0, data);
        query.setString(1, pracownikLogin);
        List<Dzialanie> list = query.list();
        return list;
    }

    @Override
    public void removeDzialanie(Date d, String pracownikLogin) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Dzialanie where dataGodzina=? and pracownik.login=?");
        query.setTimestamp(0, d);
        query.setString(1, pracownikLogin);
        System.out.println("Data z DAO " + d);
        List<Dzialanie> list = query.list();
        if (null != list) {
            session.delete(list.get(0));
        }
    }
}

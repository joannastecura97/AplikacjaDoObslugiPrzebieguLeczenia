/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.Pracownik;
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
public class PracownikDAOImpl implements PracownikDAO {

    private static final Logger logger = LoggerFactory.getLogger(PracownikDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public Pracownik getPracownikByNrPWZ(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pracownik p = (Pracownik) session.load(Pracownik.class, new String(id));
        logger.info("Person loaded successfully, Person details=" + p);
        return p;
    }

    @Override
    public Pracownik checkLogin(String login) {
        Session session = this.sessionFactory.getCurrentSession();

        System.out.println("Wskoczylem do checkLogin");
        Query query = session.createQuery(" from Pracownik as p where p.login=?");
        query.setParameter(0, login);
        List<Pracownik> list = query.list();
        System.out.println("Jestem w checkLogin");
        if ((list != null) && (list.size() > 0)) {
            System.out.println("Moj pracownik:" + list.get(0));
            return list.get(0);

        }

        return null;
    }

}

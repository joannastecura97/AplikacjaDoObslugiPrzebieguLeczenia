/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KartaInformacyjna;
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
public class KartaInformacyjnaDAOImpl implements KartaInformacyjnaDAO {

    private static final Logger logger = LoggerFactory.getLogger(KartaInformacyjnaDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addKartaInformacyjna(KartaInformacyjna p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("KartaInformacyjna saved successfully, KartaInformacyjna Details=" + p);
    }

    @Override
    public List<KartaInformacyjna> listKartaInformacyjna() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KartaInformacyjna> kartaInformacyjnaList = session.createQuery("from KartaInformacyjna").list();
        for (KartaInformacyjna p : kartaInformacyjnaList) {
            logger.info("KartaInformacyjna List::" + p);
        }
        return kartaInformacyjnaList;
    }

    @Override
    public List<KartaInformacyjna> listKartaInformacyjnaPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from KartaInformacyjna as h where h.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<KartaInformacyjna> kartaInformacyjnaList = query.list();

        return kartaInformacyjnaList;
    }
}

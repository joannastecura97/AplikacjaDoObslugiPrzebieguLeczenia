/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

/**
 *
 * @author stecu
 */
import com.hospital.spring.model.KsiegaZabiegow;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class KsiegaZabiegowDAOImpl implements KsiegaZabiegowDAO {

    private static final Logger logger = LoggerFactory.getLogger(KsiegaZabiegowDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addKsiegaZabiegow(KsiegaZabiegow p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("KsiegaZabiegow saved successfully, KsiegaZabiegow Details=" + p);
    }

    @Override
    public List<KsiegaZabiegow> listKsiegaZabiegow() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KsiegaZabiegow> ksiegaZabiegowList = session.createQuery("from KsiegaZabiegow").list();
        for (KsiegaZabiegow p : ksiegaZabiegowList) {
            logger.info("KsiegaZabiegow List::" + p);
        }
        return ksiegaZabiegowList;
    }

    @Override
    public List<KsiegaZabiegow> listKsiegaZabiegowPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from KsiegaZabiegow as h where h.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<KsiegaZabiegow> ksiegaZabiegowList = query.list();

        return ksiegaZabiegowList;
    }
}

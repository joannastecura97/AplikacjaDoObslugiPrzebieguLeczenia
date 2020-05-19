/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.KsiegaRaportowLekarskich;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stecu
 */
@Repository
public class KsiegaRaportowLekarskichDAOImpl implements KsiegaRaportowLekarskichDAO {

    private static final Logger logger = LoggerFactory.getLogger(KsiegaRaportowLekarskichDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addKsiegaRaportowLekarskich(KsiegaRaportowLekarskich p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("KsiegaRaportowLekarskich saved successfully, KsiegaRaportowLekarskich Details=" + p);
    }

    @Override
    public List<KsiegaRaportowLekarskich> listKsiegaRaportowLekarskich() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichList = session.createQuery("from KsiegaRaportowLekarskich").list();
        for (KsiegaRaportowLekarskich p : ksiegaRaportowLekarskichList) {
            logger.info("KsiegaRaportowLekarskich List::" + p);
        }
        return ksiegaRaportowLekarskichList;
    }

    @Override
    public List<KsiegaRaportowLekarskich> listKsiegaRaportowLekarskichPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from KsiegaRaportowLekarskich as h where h.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichList = query.list();

        return ksiegaRaportowLekarskichList;
    }
}

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
import com.hospital.spring.model.KsiegaRaportowPielegniarskich;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class KsiegaRaportowPielegniarskichDAOImpl implements KsiegaRaportowPielegniarskichDAO {

    private static final Logger logger = LoggerFactory.getLogger(KsiegaRaportowPielegniarskichDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public List<KsiegaRaportowPielegniarskich> listKsiegaRaportowPielegniarskich() {
        Session session = this.sessionFactory.getCurrentSession();
        List<KsiegaRaportowPielegniarskich> ksiegaRaportowPielegniarskichList = session.createQuery("from KsiegaRaportowPielegniarskich").list();
        for (KsiegaRaportowPielegniarskich p : ksiegaRaportowPielegniarskichList) {
            logger.info("KsiegaPrzyjecWypisow List::" + p);
        }
        return ksiegaRaportowPielegniarskichList;
    }
}

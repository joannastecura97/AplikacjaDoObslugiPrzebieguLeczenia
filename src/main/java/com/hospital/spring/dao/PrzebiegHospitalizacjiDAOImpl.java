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
import com.hospital.spring.model.PrzebiegHospitalizacji;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PrzebiegHospitalizacjiDAOImpl implements PrzebiegHospitalizacjiDAO {

    private static final Logger logger = LoggerFactory.getLogger(PrzebiegHospitalizacjiDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addPrzebiegHospitalizacji(PrzebiegHospitalizacji p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("PrzebiegHospitalizacji saved successfully, PrzebiegHospitalizacji Details=" + p);
    }

    @Override
    public List<PrzebiegHospitalizacji> listPrzebiegHospitalizacji() {
        Session session = this.sessionFactory.getCurrentSession();
        List<PrzebiegHospitalizacji> przebiegHospitalizacjiList = session.createQuery("from PrzebiegHospitalizacji").list();
        for (PrzebiegHospitalizacji p : przebiegHospitalizacjiList) {
            logger.info("PrzebiegHospitalizacjiList::" + p);
        }
        return przebiegHospitalizacjiList;
    }

    @Override
    public List<PrzebiegHospitalizacji> listPrzebiegHospitalizacjiPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from PrzebiegHospitalizacji as h where h.historiaChoroby.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<PrzebiegHospitalizacji> przebiegHospitalizacjiList = query.list();

        return przebiegHospitalizacjiList;
    }
}

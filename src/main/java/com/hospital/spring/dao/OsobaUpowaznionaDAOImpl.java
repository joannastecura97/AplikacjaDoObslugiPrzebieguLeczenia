package com.hospital.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hospital.spring.model.OsobaUpowazniona;
import org.hibernate.Query;

@Repository
public class OsobaUpowaznionaDAOImpl implements OsobaUpowaznionaDAO {

    private static final Logger logger = LoggerFactory.getLogger(OsobaUpowaznionaDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addOsobaUpowazniona(OsobaUpowazniona p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("OsobaUpowazniona saved successfully, OsobaUpowazniona Details=" + p);
    }

    @Override
    public void removeOsobaUpowazniona(String tel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from OsobaUpowazniona where nrTelefonu=?");
        query.setString(0, tel);
        List<OsobaUpowazniona> list = query.list();
        if (null != list) {
            session.delete(list.get(0));
        }
    }

    @Override
    public List<OsobaUpowazniona> listOsobaUpowaznionaPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from OsobaUpowazniona as h where h.historiaChoroby.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<OsobaUpowazniona> osobaUpowaznionaList = query.list();

        return osobaUpowaznionaList;
    }

}

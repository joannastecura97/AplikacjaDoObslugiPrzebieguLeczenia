/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.WywiadPielegniarski;
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
public class WywiadPielegniarskiDAOImpl implements WywiadPielegniarskiDAO {

    private static final Logger logger = LoggerFactory.getLogger(WywiadPielegniarskiDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public List<WywiadPielegniarski> listWywiadPielegniarskiPacjenta(String pesel) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from WywiadPielegniarski as h where h.historiaChoroby.pacjent.pesel=?");
        query.setParameter(0, pesel);
        List<WywiadPielegniarski> wywiadPielegniarskiList = query.list();

        return wywiadPielegniarskiList;
    }
}

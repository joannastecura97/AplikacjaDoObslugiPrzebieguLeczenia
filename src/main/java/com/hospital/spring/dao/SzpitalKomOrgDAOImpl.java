/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.dao;

import com.hospital.spring.model.SzpitalKomOrg;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author stecu
 */
public class SzpitalKomOrgDAOImpl implements SzpitalKomOrgDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public SzpitalKomOrg getSzpitalKomOrgByNrResortowy(String nr) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from SzpitalKomOrg where kodResortowy= ? ");
        query.setString(0, nr);
        List<SzpitalKomOrg> list = query.list();
        if (null != list) {
            return list.get(0);
        } else {
            return null;
        }
    }
}

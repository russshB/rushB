/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Administer;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Transactional
@Repository("AdministerDaoImpl")
public class AdministerDaoImpl implements AdministerDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Administer getAdministerById(String id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Administer.class,id);
        
    }
    
}

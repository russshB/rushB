/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Administer;
import com.qdu.pojo.Users;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Transactional
@Repository
@Component("AdministerDaoImpl")
public class AdministerDaoImpl implements AdministerDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private UsersDao userdao;
    
    @Override
    public Administer getAdministerByAid(String aid) {
        Session session = sessionFactory.getCurrentSession();
        Administer admin = session.get(Administer.class, aid);
        return admin;
    }

    @Override
    public Administer getAdministerByUid(String uid) {
        Session session = sessionFactory.getCurrentSession();
        Users user  = userdao.getUserById(uid);
        Administer administer = user.getAdministers();
        return administer;
        
    }

    @Override
    public Boolean addAdminister(Administer administer) {
        Session session = sessionFactory.getCurrentSession();
        Administer a = session.get(Administer.class,administer.getAid());
        if(null!=a){
            session.save(administer);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean deleteAdminister(String aid) {
        Session session = sessionFactory.getCurrentSession();
        Administer a = session.get(Administer.class,aid);
        if(null!=a){
            session.delete(a);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void updateAdminister(Administer administer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(administer);
        
    }
    
}

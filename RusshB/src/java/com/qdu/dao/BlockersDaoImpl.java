/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Blockers;
import com.qdu.pojo.Users;
import java.util.List;
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
@Component("BlockersDaoImpl")
public class BlockersDaoImpl implements BlockersDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private UsersDao usersDao;
    
    @Override
    public Blockers getBlockersByBid(String bid) {
        Session session = sessionFactory.getCurrentSession();
        Blockers blocker = session.get(Blockers.class, bid);
        return blocker;
    }

    @Override
    public List<Blockers> getBlockersByUid(String uid) {
        Session session = sessionFactory.getCurrentSession();
        Users users = usersDao.getUserById(uid);
        List<Blockers> blocker = users.getBlockerses();
        return blocker;
    }

    @Override
    public Boolean addBlocker(Blockers blockers) {
        Session session = sessionFactory.getCurrentSession();
        Blockers blockers_test = session.get(Blockers.class, blockers.getBid());
        if(null!= blockers_test){
            session.save(blockers);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean deleteBlocker(String bid) {
        Session session = sessionFactory.getCurrentSession();
        Blockers blockers_test = session.get(Blockers.class, bid);
        if(null!= blockers_test){
            session.save(blockers_test);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void updateBlocker(Blockers blockers) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(blockers);
    }
    
}

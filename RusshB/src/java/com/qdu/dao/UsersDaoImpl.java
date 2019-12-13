/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Users;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Transactional
@Repository("UsersDaoImpl")
public class UsersDaoImpl implements Serializable,UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Users getUserById(String uid) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Users.class, uid);
    }

    @Override
    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Users");
        List<Users> list = query.list();
        return list;
    }

    @Override
    public Boolean addUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        if (null == getUserById(user.getUid())) {
            session.save(user);
            return true;

        } else {
            System.out.println("该用户已存在！");
            return false;
        }
    }

    @Override
    public Boolean deleteUser(String uid) {
        Session session = sessionFactory.getCurrentSession();
        if (null != session.get(Users.class, uid)) {
            session.delete(session.get(Users.class, uid));
            return true;
        } else {
            System.out.println("该用户不存在");
            return false;
        }
    }

    @Override
    public void updateUser(String uid) {
        Session session = sessionFactory.getCurrentSession();
        session.update(session.get(Users.class, uid));

    }

}

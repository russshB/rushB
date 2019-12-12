/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Users;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Transactional
@Repository
@Component("UsersDaoImpl")
public class UsersDaoImpl implements UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Users getUserById(String uid) {
        Session session = sessionFactory.getCurrentSession();
        Users user = session.get(Users.class, uid);

        return user;
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
        Users user_test = getUserById(user.getUid());
        if (null == user_test) {
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
        
        Users user = getUserById(uid);
        if(null!=user){
            session.delete(user);
            return true;
        }else{
            System.out.println("该用户不存在");
            return false;
        }
    }

    @Override
    public void updateUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
            session.update(user);
            
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Message;
import java.io.Serializable;
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
@Repository("MessageDaoImpl")
public class MessageDaoImpl implements Serializable,MessageDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Message getMessageById(String mid) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Message.class, mid);
    }

    @Override
    public List<Message> getAllMessageByBeenUser(String uid) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Message where beenuid = :uid");
        query.setParameter("uid", uid);
        List<Message>  list = query.list();
        
        return list;
    }

    @Override
    public Boolean addMessage(Message message) {
        Session session = sessionFactory.getCurrentSession();
        if(session.get(Message.class,message.getMid())==null){
            session.save(message);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Boolean deleteMessage(String mid) {
        Session session = sessionFactory.getCurrentSession();
        if(session.get(Message.class,mid)!=null){
            session.delete(session.get(Message.class,mid));
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void updateMessage(String mid) {
        Session session = sessionFactory.getCurrentSession();
        session.update(session.get(Message.class,mid));
    }

    @Override
    public List<Message> getAllMessageByUser(String uid) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Message where muid = :mid");
        query.setParameter("muid", uid);
        List<Message> list = query.list();
        return list;
    }
    
}

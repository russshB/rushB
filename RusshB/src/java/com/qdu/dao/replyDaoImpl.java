/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
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
@Repository("ReplyDaoImpl")
public class replyDaoImpl implements Serializable,replyDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Reply getReplyById(int rid) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Reply.class, rid);
    }

    @Override
    public List<Reply> getAllReplyByPid(String pid) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Reply where Rpid = :pid");
        query.setParameter("pid", pid);
        List<Reply> list = query.list();
        
        return list;
        
    }

    @Override
    public Boolean addReply(Reply reply) {
        Session session  =sessionFactory.getCurrentSession();
        if(null==session.get(Reply.class, reply.getRid())){
            session.save(reply);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Boolean deleteReplyByRid(int rid) {
        Session session = sessionFactory.getCurrentSession();
        
        if(null!=session.get(Reply.class, rid)){
            session.delete(session.get(Reply.class, rid));
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public void updateReply(int rid) {
        Session session = sessionFactory.getCurrentSession();
        session.update(session.get(Reply.class, rid));
        
    }

    
    
}

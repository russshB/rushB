/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
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
@Component("ReplyDaoImpl")
public class replyDaoImpl implements replyDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Reply getReplyById(String rid) {
        Session session = sessionFactory.getCurrentSession();
        Reply reply = session.get(Reply.class, rid);
        return reply;
    }

    @Override
    public List<Reply> getAllReplyByPid(String pid) {
        Session session = sessionFactory.getCurrentSession();
        
        Post post = session.get(Post.class, pid);
        List<Reply> list = post.getReplies();
        
        return list;
        
    }

    @Override
    public Boolean addReply(Reply reply) {
        Session session  =sessionFactory.getCurrentSession();
        Reply reply_test = session.get(Reply.class, reply.getRid());
        if(null!=reply_test){
            session.save(reply);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Boolean deleteReplyByRid(String rid) {
        Session session = sessionFactory.getCurrentSession();
        
        Reply reply = session.get(Reply.class, rid);
        
        if(null!=reply){
            session.delete(reply);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public void updateReply(Reply reply) {
        Session session = sessionFactory.getCurrentSession();
        session.update(reply);
        
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
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
@Repository("PostDaoImpl")
public class PostDaoImpl implements Serializable,PostDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private UsersDao usersDao;
    
    @Override
    public Post getPostById(String pid) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Post.class, pid);
    }

    @Override
    public List<Post> getAllPost() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Post");
        List<Post> list = query.list();
        return list;
    }

    @Override
    public Boolean addPost(Post post) {
        Session session = sessionFactory.getCurrentSession();
        if (null == getPostById(post.getPid())) {
            session.save(getPostById(post.getPid()));
            return true;
            
        } else {
            System.out.println("该用户已存在！");
            return false;
        }
    }

    @Override
    public Boolean deletePostById(String pid) {
        Session session = sessionFactory.getCurrentSession();
        session.get(Post.class, pid);
        if(null!=session.get(Post.class, pid)){
            session.delete(session.get(Post.class, pid));
            return true;
        }else{
            System.out.println("该帖子不存在");
            return false;
        }
    }

    @Override
    public void updatePost(String pid) {
         Session session = sessionFactory.getCurrentSession();
            session.update(session.get(Post.class, pid));
        
        
    }

    @Override
    public List<Reply> getAllReplyByPost(String pid) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Reply where Rpid = :pid");
        List<Reply> list = query.list();
        
        return list;
    }

    @Override
    public List<Post> getAllPostByPower(String power) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Post where Ppower = :power");
        query.setParameter("power",power);
        List<Post> list = query.list();
        
        return list;
    }

    @Override
    public List<Post> getAllPostByBlocks(String block) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Post where pblock = :block");
        query.setParameter("block", block);
        List<Post> list = query.list();
        return list;
        
    }

    
}

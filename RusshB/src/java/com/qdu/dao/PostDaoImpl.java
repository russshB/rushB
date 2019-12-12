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
@Component("PostDaoImpl")
public class PostDaoImpl implements PostDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Post getPostById(String pid) {
        Session session = sessionFactory.getCurrentSession();
        
        Post post = session.get(Post.class, pid);
        
        return post;
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
        Post post_test = getPostById(post.getPid());
        if (null == post_test) {
            session.save(post);
            return true;
            
        } else {
            System.out.println("该用户已存在！");
            return false;
        }
    }

    @Override
    public Boolean deletePostById(String pid) {
        Session session = sessionFactory.getCurrentSession();
        
        Post post = getPostById(pid);
        if(null!=post){
            session.delete(post);
            return true;
        }else{
            System.out.println("该帖子不存在");
            return false;
        }
    }

    @Override
    public void updatePost(Post post) {
         Session session = sessionFactory.getCurrentSession();
            session.update(post);
        
        
    }

    @Override
    public List<Reply> getAllReplyByPost(String pid) {
        Session session = sessionFactory.getCurrentSession();
        Post post = getPostById(pid);
        List<Reply> list = post.getReplies();
        
        return list;
    }
    
}

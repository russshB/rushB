/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.PostDao;
import com.qdu.dao.PostDaoImpl;
import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test2 {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        PostDao postdao = (PostDao)applicationContext.getBean("PostDaoImpl");
        Post post = postdao.getPostById("P001");
        List<Reply> list  = post.getReplies();
        for(Reply m:list){
            System.out.println(m.getRid());
        }
    }
}

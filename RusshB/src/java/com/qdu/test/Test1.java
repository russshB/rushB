/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Message;
import com.qdu.pojo.Users;
import java.util.Set;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        UsersDao udao = (UsersDao)applicationContext.getBean("UsersDaoImpl");
        Users user = udao.getUserById("U001");
        Set<Message> list  = user.getMessagesForMbeenUid();
        for(Message m:list){
            System.out.println(m.getMid());
        }
//        System.out.println(user.getMessagesForMuid());
        
    }
}

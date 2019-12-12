/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Users;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test_GetAllUsers {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        UsersDao udao = (UsersDao)applicationContext.getBean("UsersDaoImpl");
        
        List<Users> list = udao.getAllUsers();
        for(Users user:list){
            System.out.println(user.getUid());
        }
    }
}

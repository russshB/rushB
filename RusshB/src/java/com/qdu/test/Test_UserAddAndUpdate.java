/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test_UserAddAndUpdate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        UsersDao udao = (UsersDao)applicationContext.getBean("UsersDaoImpl");
        Users user = new Users("U008","IU008","吉良吉影","123","男","370685100011002222");
        udao.addUser(user);
        
        
    }
}

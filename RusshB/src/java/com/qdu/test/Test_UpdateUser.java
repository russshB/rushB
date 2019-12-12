/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Users;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test_UpdateUser {
    public static void main(String[] args) throws ParseException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        UsersDao udao = (UsersDao)applicationContext.getBean("UsersDaoImpl");
        
        Users user = udao.getUserById("U006");
        
        String dateString = "1800-02-04";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(dateString);
        
        user.setUbirthday(date);
        
        udao.updateUser(user);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.AdministerDao;
import com.qdu.pojo.Administer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test_getAdministerByUid {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        AdministerDao administerDao =(AdministerDao)applicationContext.getBean("AdministerDaoImpl");
        
        Administer administer = administerDao.getAdministerByUid("U001");
        System.out.println(administer.getAid());
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.test;

import com.qdu.dao.BlockersDao;
import com.qdu.pojo.Blockers;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Test_BlockersByUid {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qdu/config/Spring_Config.xml");
        BlockersDao blockersDao = (BlockersDao)applicationContext.getBean("BlockersDaoImpl");
        List<Blockers> list =blockersDao.getBlockersByUid("U001");
        for(Blockers b:list){
            System.out.println(b.getBid());
        }
    
    }
}

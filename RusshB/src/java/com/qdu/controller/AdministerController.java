/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import com.qdu.dao.AdministerDao;
import com.qdu.dao.PostDao;
import com.qdu.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/admin")
public class AdministerController {
    
    @Autowired
    private AdministerDao administerDao;
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private PostDao postDao;
    
    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
    public String adminLogin(@RequestParam("username")String aid,@RequestParam("password")String pwd,Model model){
        
        if(administerDao.getAdministerById(aid).getPwd().equals(pwd)){
            model.addAttribute("Alluser",usersDao.getAllUsers());
            model.addAttribute("Allpost",postDao.getAllPost());
            return "userManage";
        }
        else
            return "loginError";
    }
    
}

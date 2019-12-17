/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import com.qdu.dao.PostDao;
import com.qdu.dao.UsersDao;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Administrator
 */
@Controller
public class IndexController {
    @Autowired
    private PostDao postDao;
    @Autowired
    private UsersDao usersDao;
    
    @RequestMapping({"/","/index"}) 
    public String index(Model model){
        
        model.addAttribute("user",usersDao.getUserById("U001"));
        
        return "index";
    }
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(String userid,
                        String password,
                        HttpSession session,Model model,RedirectAttributes modelMap) {
        if(usersDao.getUserById(userid)==null) return "loginRrror";
        else if(usersDao.getUserById(userid).getUpwd().equals(password)){
            session.setAttribute("users", usersDao.getUserById(userid));
            return "register";
        }
        else return "loginRrror";
    }
}

package com.qdu.controller;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UsersController {
    
    @Autowired
    private UsersDao usersDao;

    
    @RequestMapping("/toregister")
    public String register(){
        return "register";
    }

   @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(String userid,
                        String password,
                        HttpSession session,Model model,RedirectAttributes modelMap) {
        if(usersDao.getUserById(userid)==null) return "loginError";
        else if(usersDao.getUserById(userid).getUpwd().equals(password)){
            session.setAttribute("users", usersDao.getUserById(userid));
            return "bankuai";
        }
        else return "loginError";
    }

    @ResponseBody
    @RequestMapping(value="/register", method = RequestMethod.POST,
                        produces="text/html;charset=utf-8")
    public String register(Users user,HttpSession session){
        if(usersDao.getUserById(user.getUid())!=null)
            return "该账号已被注册";
        else{
            usersDao.addUser(user);
            return "0";
        }
            
        
    }

}

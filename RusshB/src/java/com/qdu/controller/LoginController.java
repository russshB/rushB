package com.qdu.controller;

import com.qdu.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private UsersDao usersDao;


    @RequestMapping(value="/do", method = RequestMethod.POST)
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

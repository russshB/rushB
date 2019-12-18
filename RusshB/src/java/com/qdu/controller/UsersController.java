package com.qdu.controller;

import com.qdu.dao.PostDao;
import com.qdu.dao.UsersDao;
import com.qdu.pojo.Post;
import com.qdu.pojo.Users;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UsersController {
    
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private PostDao postDao;

    @RequestMapping("/topersonhome")
    public String personhome(){
        return "personhome";
    }
    
    @RequestMapping("/toregister")
    public String register(){
        return "register";
    }

   @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(String userid,
                        String password,
                        HttpSession session,Model model) {
        if(usersDao.getUserById(userid)==null) return "loginError";
        else if(usersDao.getUserById(userid).getUpwd().equals(password)){
            session.setAttribute("users", usersDao.getUserById(userid));
            model.addAttribute("posts", postDao.getAllPost());
//            for(Post post:postDao.getAllPost()){
//                map.put(post.getPid(),usersDao.getUserById(post.getUser()));
//            }
            return "home";
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

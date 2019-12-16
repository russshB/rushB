package com.qdu.controller;

import com.qdu.dao.UsersDao;
import com.qdu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * usersController
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersDao usersDao;


    /**
     *  注册 页面
     */
    @RequestMapping(value="/register",method = RequestMethod.GET)
    public String register() {
        return "register";
    }
    /**
     *  注册
     */
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String add(Users user) {
        //1.字段非空校验
        //2.判断用户是否存在
        if(usersDao.getUserById(user.getUid())==null){
            usersDao.addUser(user);
            return "index";

        }else{
            return "Error";
        }
      
    }

    /**
     * 修改用户信息
     */
    @RequestMapping(value="/update")
    public String update(@RequestBody Users users, Model model) {
        usersDao.updateUser(users.getUid());
        return null;
    }

}

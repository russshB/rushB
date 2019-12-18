/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import com.qdu.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/post")
public class PostController{
    
    @Autowired
    private PostDao postDao;
    
    @RequestMapping(value = "/getAllpostsByBlock")
    public String getAllpostsByBlock(String Block){
        return "home";
    }
    
    @RequestMapping("/topostPage")
    public String topostPage(int pid,Model model){
        model.addAttribute("post",postDao.getPostById(pid));
        model.addAttribute("replys",postDao.getAllReplyByPost(pid));
         return "art";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import com.qdu.dao.PostDao;
import com.qdu.dao.UsersDao;
import com.qdu.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/post")
public class PostController{
    
    @Autowired
    private PostDao postDao;
    @Autowired
    private UsersDao usersDao;
    
    @RequestMapping(value = "/getAllpostsByBlock")
    public String getAllpostsByBlock(@RequestParam("block")String Block,Model model){
        model.addAttribute("posts",postDao.getAllPostByBlocks(Block));
        return "home";
    }
    
    @RequestMapping("/topostPage")
    public String topostPage(int pid,Model model){
        model.addAttribute("post",postDao.getPostById(pid));
        model.addAttribute("replys",postDao.getAllReplyByPost(pid));
         return "art";
    }
    
    @RequestMapping("/newpost")
    public String toNewPost(){
        return "new_post";
    }
    
    @RequestMapping("/addPost")
    public String addPost(@RequestParam(name = "user")String uid,
                            @RequestParam(name = "title")String title,
                            @RequestParam(name = "abstr")String abstr,
                            @RequestParam(name = "content")String detail,
                            @RequestParam(name = "block")String block){
        Post post = new Post(usersDao.getUserById(uid), title, abstr, detail, block);
//        System.out.println(post.getPdetails());
        postDao.addPost(post);
        return "transPage";
    }
}

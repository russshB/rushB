/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import com.qdu.dao.PostDao;
import com.qdu.pojo.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
public class IndexController {
    @Autowired
    private PostDao postDao;
    
    @RequestMapping({"/","/index"}) 
    public String index(Model model){
        List<Post> b001 = postDao.getAllPostByBlocks("B001");
        
        model.addAttribute("B001", b001);
        
        return "index";
    }
}

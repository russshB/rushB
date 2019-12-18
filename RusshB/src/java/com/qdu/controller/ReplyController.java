package com.qdu.controller;

import com.qdu.dao.replyDao;
import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
import com.qdu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    private replyDao replyDao1;


    //根据id获得回复信息
    @RequestMapping("/getReplyById")
    @ResponseBody
    public Reply getReplyById(int rid){
        return replyDao1.getReplyById(rid);
    }

    //获得所有回复同一条帖子的回复
    @RequestMapping("/getAllReplyByPid")
    @ResponseBody
    public List<Reply> getAllReplyByPid(String pid){
        return replyDao1.getAllReplyByPid(pid);
    }

    //添加新的回复
    @RequestMapping("/addReply")
    @ResponseBody
    public Boolean addReply(Reply reply){
//        Reply reply = new Reply(post, user, detail);
        return replyDao1.addReply(reply);
    }

    //根据id删除回复
    @RequestMapping("/deleteReplyByRid")
    @ResponseBody
    public Boolean deleteReplyByRid(int rid){
        return replyDao1.deleteReplyByRid(rid);
    }
    //修改回复信息
//    public void updateReply(String rid){
//
//    }

}


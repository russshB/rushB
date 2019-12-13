/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Reply;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface replyDao {
    //根据id获得回复信息
    Reply getReplyById(String rid);
    //获得所有回复同一条帖子的回复
    List<Reply> getAllReplyByPid(String pid);
    //添加新的回复
    Boolean addReply(Reply reply);
    //根据id删除回复
    Boolean deleteReplyByRid(String rid);
    //修改回复信息
    void updateReply(String rid);
    
}

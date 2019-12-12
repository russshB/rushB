/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Message;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface MessageDao {
    //根据id获得消息
    Message getMessageById(String mid);
    //获得发送给某个用户的所有信息
    List<Message> getAllMessageByBeenUser(String uid);
    //添加新的信息
    Boolean addMessage(Message message);
    //根据id删除信息
    Boolean deleteMessage(String mid);
    //修改信息
    void updateMessage(Message message);
}

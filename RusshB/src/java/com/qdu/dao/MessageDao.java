/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Message;
import com.qdu.pojo.Users;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface MessageDao {
    //根据id获得消息
    Message getMessageById(int mid);
    //获得发送给某个用户的所有信息
    List<Message> getAllMessageByBeenUser(String uid);
    //获得某个用户发送的所有信息
    List<Message> getAllMessageByUser(String uid);
    //添加新的信息
    Boolean addMessage(Message message);
    //根据id删除信息
    Boolean deleteMessage(int mid);
    //修改信息
    void updateMessage(int mid);
}

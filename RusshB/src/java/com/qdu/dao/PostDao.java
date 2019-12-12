/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Post;
import com.qdu.pojo.Reply;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface PostDao {
    //根据id获得帖子信息
    Post getPostById(String pid);
    //获得所有帖子信息
    List<Post> getAllPost();
    //获取某个id帖子的所有回复
    List<Reply> getAllReplyByPost(String pid);
    //添加新的帖子信息
    Boolean addPost(Post post);
    //根据id删除帖子
    Boolean deletePostById(String pid);
    //修改帖子信息
    void updatePost(Post post);
}

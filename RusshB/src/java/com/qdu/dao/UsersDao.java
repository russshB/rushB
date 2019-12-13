/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Users;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface UsersDao {
    //通过Uid查询某个用户
    Users getUserById(String uid);
    //获得所有用户信息
    List<Users> getAllUsers();
    //添加新的用户信息
    Boolean addUser(Users user);
    //根据id删除用户
    Boolean deleteUser(String uid);
    //修改用户信息
    void updateUser(String uid);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Administer;

/**
 *
 * @author Administrator
 */
public interface AdministerDao {
     //根据aid获得管理员信息
    Administer getAdministerByBid(String aid);
    //根据Uid获得管理员信息
    Administer getAdministerByUid(String uid);
    //新增管理员
    void addAdminister(Administer administer);
    //根据aid删除管理员信息
    void deleteAdminister(String aid);
    //修改管理员信息
    void updateAdminister(Administer administer);
}

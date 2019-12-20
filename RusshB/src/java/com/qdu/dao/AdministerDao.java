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
    //根据Aid获得管理员信息
    Administer getAdministerById(String id);
    
    
}

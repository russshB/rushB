/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.dao;

import com.qdu.pojo.Blockers;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface BlockersDao {
    //根据Bid获得版主信息
    Blockers getBlockersByBid(String bid);
    //根据Uid获得版主信息
    List<Blockers> getBlockersByUid(String uid);
    //新增版主
    Boolean addBlocker(Blockers blockers);
    //根据bid删除版主信息
    Boolean deleteBlocker(String bid);
    //修改版主信息
    void updateBlocker(Blockers blockers);
    
}

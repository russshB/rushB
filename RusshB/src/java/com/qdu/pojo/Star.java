/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "star")
@IdClass(StarKey.class)
public class Star implements Serializable{
    @Id
    @Column(name = "SUid")
    private String uid;
    @Id
    @Column(name = "SPid")
    private String pid;

    public Star() {
    }

    public Star(String uid, String pid) {
        this.uid = uid;
        this.pid = pid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    
    
    
}

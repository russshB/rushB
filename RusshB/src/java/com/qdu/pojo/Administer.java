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
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;

/**
 *
 * @author Administrator
 */
@Entity
@DynamicInsert
@Table(name = "Administer",
        schema = "dbo",
        catalog = "Russh"
)
public class Administer implements Serializable{
    
    @Id
    @Column(name = "Aid")
    private String Aid;
    @Column(name = "Apwd")
    private String pwd;

    public Administer() {
    }

    public Administer(String Aid, String pwd) {
        this.Aid = Aid;
        this.pwd = pwd;
    }

    public String getAid() {
        return Aid;
    }

    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    
}

package com.qdu.pojo;
// Generated 2019-12-10 22:48:34 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Users generated by hbm2java
 */
@Entity
@DynamicInsert
@Table(name = "Users",
         schema = "dbo",
         catalog = "Russh"
)
public class Users implements java.io.Serializable {

    @Id
    @Column(name = "Uid", unique = true, nullable = false)
    private String uid;
    @Column(name = "Uimg", nullable = false)
    private String uimg;
    @Column(name = "Uname", nullable = false)
    private String uname;
    @Column(name = "Upwd", nullable = false)
    private String upwd;
    @Column(name = "UGender", nullable = false)
    private String ugender;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Ubirthday", length = 23)
    private Date ubirthday;
    @Column(name = "Upid", nullable = false)
    private String upid;
    @Column(name = "Uemail")
    private String uemail;
    @Column(name = "UphoneNo")
    private String uphoneNo;
    @Column(name = "Upower", columnDefinition = "int default 0")
    private Integer upower;
    @Column(name = "URole", columnDefinition = "int default 0")
    private Integer urole;

    public Users(String uid, String uimg, String uname, String upwd, String ugender, Date ubirthday, String upid, String uemail, String uphoneNo, Integer upower) {
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.upwd = upwd;
        this.ugender = ugender;
        this.ubirthday = ubirthday;
        this.upid = upid;
        this.uemail = uemail;
        this.uphoneNo = uphoneNo;
        this.upower = upower;
    }

    public Users() {
    }

    public Users(String uid, String uimg, String uname, String upwd, String ugender, String upid) {
        this.uid = uid;
        this.uimg = uimg;
        this.uname = uname;
        this.upwd = upwd;
        this.ugender = ugender;
        this.upid = upid;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUimg() {
        return this.uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return this.upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUgender() {
        return this.ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public Date getUbirthday() {
        return this.ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getUpid() {
        return this.upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public String getUemail() {
        return this.uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUphoneNo() {
        return this.uphoneNo;
    }

    public void setUphoneNo(String uphoneNo) {
        this.uphoneNo = uphoneNo;
    }

    public Integer getUpower() {
        return this.upower;
    }

    public void setUpower(Integer upower) {
        this.upower = upower;
    }

}

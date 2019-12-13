package com.qdu.pojo;
// Generated 2019-12-10 22:48:34 by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Message generated by hbm2java
 */
@Entity
@Table(name = "Message",
         schema = "dbo",
         catalog = "Russh"
)
public class Message implements java.io.Serializable {

    @Id
    @Column(name = "Mid", unique = true, nullable = false)
    private String mid;
    @Column(name = "Mbeenuid", unique = true, nullable = false)
    private String beenuid;
    @Column(name = "Muid", unique = true, nullable = false)
    private String muid;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Mdate", nullable = false, length = 23)
    private Date mdate;
    @Column(name = "Mdetail", nullable = false)
    private String mdetail;

    public Message() {
    }

    public Message(String mid, String beenuid, String muid, Date mdate, String mdetail) {
        this.mid = mid;
        this.beenuid = beenuid;
        this.muid = muid;
        this.mdate = mdate;
        this.mdetail = mdetail;
    }

 

    public String getMid() {
        return this.mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }


    public Date getMdate() {
        return this.mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public String getMdetail() {
        return this.mdetail;
    }

    public void setMdetail(String mdetail) {
        this.mdetail = mdetail;
    }

    public String getBeenuid() {
        return beenuid;
    }

    public void setBeenuid(String beenuid) {
        this.beenuid = beenuid;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

}

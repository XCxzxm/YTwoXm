package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bid;
    private Integer oid;
    private Integer sid;
    private Integer eid;
    private Integer status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date regdate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Bill() {
    }

    public Bill(Integer bid, Integer oid, Integer sid, Integer eid, Integer status, Date regdate) {
        this.bid = bid;
        this.oid = oid;
        this.sid = sid;
        this.eid = eid;
        this.status = status;
        this.regdate = regdate;
    }
}

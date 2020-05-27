package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "mission")
public class Mission {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer mid;
    private Integer oid;
    private Integer fid;
    private Integer sid;
    private Integer mtype;
    private Integer status;
    private Integer totalmoney;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date comitedate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdate;
    private Integer eid;
    private String remark;

    public Mission() {
    }

    public Mission(Integer oid, Integer fid, Integer sid, Integer mtype, Integer status, Integer totalmoney, Date comitedate, Date createdate, Integer eid, String remark) {
        this.oid = oid;
        this.fid = fid;
        this.sid = sid;
        this.mtype = mtype;
        this.status = status;
        this.totalmoney = totalmoney;
        this.comitedate = comitedate;
        this.createdate = createdate;
        this.eid = eid;
        this.remark = remark;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getComitedate() {
        return comitedate;
    }

    public void setComitedate(Date comitedate) {
        this.comitedate = comitedate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

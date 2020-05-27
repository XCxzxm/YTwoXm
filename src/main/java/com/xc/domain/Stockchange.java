package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "stockchange")
public class Stockchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scid;
    private Integer pid;
    private Integer did;
    private Integer mid;
    private Integer odid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sdate;
    private Integer sid;
    private Integer eid;
    private Integer geteid;
    private Integer stype;
    private String remark;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
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

    public Integer getGeteid() {
        return geteid;
    }

    public void setGeteid(Integer geteid) {
        this.geteid = geteid;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Stockchange() {
    }

    public Stockchange(Integer pid, Integer did, Integer mid, Integer odid, Date sdate, Integer sid, Integer eid, Integer geteid, Integer stype, String remark) {
        this.pid = pid;
        this.did = did;
        this.mid = mid;
        this.odid = odid;
        this.sdate = sdate;
        this.sid = sid;
        this.eid = eid;
        this.geteid = geteid;
        this.stype = stype;
        this.remark = remark;
    }
}

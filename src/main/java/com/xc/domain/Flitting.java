package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "flitting")
public class Flitting {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer fid;
    private Integer oid;
    private Integer ftype;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date outdate;
    private String fover;
    private Integer sid;
    private Integer did;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date flitdate;
    private Integer pid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public String getFover() {
        return fover;
    }

    public void setFover(String fover) {
        this.fover = fover;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Date getFlitdate() {
        return flitdate;
    }

    public void setFlitdate(Date flitdate) {
        this.flitdate = flitdate;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Flitting() {
    }

    public Flitting(Integer oid, Integer ftype, Date outdate, String fover, Integer sid, Integer did, Date flitdate, Integer pid) {
        this.oid = oid;
        this.ftype = ftype;
        this.outdate = outdate;
        this.fover = fover;
        this.sid = sid;
        this.did = did;
        this.flitdate = flitdate;
        this.pid = pid;
    }
}

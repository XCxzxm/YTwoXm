package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "plans")
public class Plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private Integer fid;
    private Integer managetype;
    private Integer handle;
    private  Integer executestatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date managedate;
    private String account;
    private String remark;
    private Integer sid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getManagetype() {
        return managetype;
    }

    public void setManagetype(Integer managetype) {
        this.managetype = managetype;
    }

    public Integer getHandle() {
        return handle;
    }

    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    public Integer getExecutestatus() {
        return executestatus;
    }

    public void setExecutestatus(Integer executestatus) {
        this.executestatus = executestatus;
    }

    public Date getManagedate() {
        return managedate;
    }

    public void setManagedate(Date managedate) {
        this.managedate = managedate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Plans(Integer pid, Integer fid, Integer managetype, Integer handle, Integer executestatus, Date managedate, String account, String remark, Integer sid) {
        this.pid=pid;
        this.fid = fid;
        this.managetype = managetype;
        this.handle = handle;
        this.executestatus = executestatus;
        this.managedate = managedate;
        this.account = account;
        this.remark = remark;
        this.sid = sid;
    }

    public Plans() {
    }


}

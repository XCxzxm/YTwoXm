package com.xc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer oid;
    private Integer cid;
    private Integer otype;
    private Integer sid;
    private Integer manager;
    private Integer status;
    private String address;
    private String receiveman;
    private String receivetel;
    private String receivepost;
    private Integer bill;
    private String payman;
    private String payaddress;
    private String paytel;
    private String managereason;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date managedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comitedate;
    private String remark;

    public Orders() {
    }

    public Orders(Integer oid, Integer cid, Integer otype, Integer sid, Integer manager, Integer status, String address, String receiveman, String receivetel, String receivepost, Integer bill, String payman, String payaddress, String paytel, String managereason, Date managedate, Date createdate, Date comitedate, String remark) {
        this.oid=oid;
        this.cid = cid;
        this.otype = otype;
        this.sid = sid;
        this.manager = manager;
        this.status = status;
        this.address = address;
        this.receiveman = receiveman;
        this.receivetel = receivetel;
        this.receivepost = receivepost;
        this.bill = bill;
        this.payman = payman;
        this.payaddress = payaddress;
        this.paytel = paytel;
        this.managereason = managereason;
        this.managedate = managedate;
        this.createdate = createdate;
        this.comitedate = comitedate;
        this.remark = remark;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOtype() {
        return otype;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getComitedate() {
        return comitedate;
    }

    public void setComitedate(Date comitedate) {
        this.comitedate = comitedate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiveman() {
        return receiveman;
    }

    public void setReceiveman(String receiveman) {
        this.receiveman = receiveman;
    }

    public String getReceivetel() {
        return receivetel;
    }

    public void setReceivetel(String receivetel) {
        this.receivetel = receivetel;
    }

    public String getReceivepost() {
        return receivepost;
    }

    public void setReceivepost(String receivepost) {
        this.receivepost = receivepost;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }

    public String getPayman() {
        return payman;
    }

    public void setPayman(String payman) {
        this.payman = payman;
    }

    public String getPayaddress() {
        return payaddress;
    }

    public void setPayaddress(String payaddress) {
        this.payaddress = payaddress;
    }

    public String getPaytel() {
        return paytel;
    }

    public void setPaytel(String paytel) {
        this.paytel = paytel;
    }

    public String getManagereason() {
        return managereason;
    }

    public void setManagereason(String managereason) {
        this.managereason = managereason;
    }

    public Date getManagedate() {
        return managedate;
    }

    public void setManagedate(Date managedate) {
        this.managedate = managedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

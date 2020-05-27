package com.xc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "receipt")
public class Receipt {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer rid;
    private Integer mid;
    private Integer oid;
    private Integer collback;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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

    public Integer getCollback() {
        return collback;
    }

    public void setCollback(Integer collback) {
        this.collback = collback;
    }

    public Receipt() {
    }

    public Receipt(Integer rid, Integer mid, Integer oid, Integer collback) {
        this.rid = rid;
        this.mid = mid;
        this.oid = oid;
        this.collback = collback;
    }
}

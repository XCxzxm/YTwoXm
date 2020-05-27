package com.xc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "station")
public class Station {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer sid;
    private Integer levels;
    private String sname;
    private String saddress;
    private String addmin;
    private Integer snoid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getAddmin() {
        return addmin;
    }

    public void setAddmin(String addmin) {
        this.addmin = addmin;
    }

    public Integer getSnoid() {
        return snoid;
    }

    public void setSnoid(Integer snoid) {
        this.snoid = snoid;
    }

    public Station() {
    }

    public Station(Integer levels, String sname, String saddress, String addmin, Integer snoid) {
        this.levels = levels;
        this.sname = sname;
        this.saddress = saddress;
        this.addmin = addmin;
        this.snoid = snoid;
    }
}

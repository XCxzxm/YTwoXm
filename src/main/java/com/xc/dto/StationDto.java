package com.xc.dto;

public class StationDto extends PageDto {
    private String sname;
    private Integer levels;

    public String getSname() {
        if (sname==""){
            return null;
        }
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }
}

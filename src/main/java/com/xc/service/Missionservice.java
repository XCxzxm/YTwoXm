package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Mission;

public interface Missionservice{
    public PageInfo<Mission> selectforname(Integer page,Integer pageSize,Integer mtype, Integer status, Integer eid,Integer mid);

    public boolean savaMission(Mission mission);

    public boolean updateMission(Mission mission);
}

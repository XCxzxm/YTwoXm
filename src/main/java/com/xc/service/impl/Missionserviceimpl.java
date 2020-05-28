package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.MissionMapper;
import com.xc.dao.ReceiptMapper;
import com.xc.domain.Mission;
import com.xc.domain.Receipt;
import com.xc.service.Missionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Missionserviceimpl implements Missionservice {
    @Autowired
    private MissionMapper missionMapper;

    @Override
    public PageInfo<Mission> selectforname(Integer page, Integer pageSize, Integer mtype, Integer status, Integer eid,Integer mid) {
        PageHelper.startPage(page,pageSize);
        List list=this.missionMapper.selectforname(mtype, status, eid,mid);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean savaMission(Mission mission) {
        Integer uifd=305764;
        uifd++;
        mission.setFid(uifd);
        Date date=new Date();
        mission.setCreatedate(date);
        return this.missionMapper.insert(mission)>0?true:false;
    }

    @Override
    public boolean updateMission(Mission mission) {
        return this.missionMapper.updateByPrimaryKey(mission)>0?true:false;
    }


}

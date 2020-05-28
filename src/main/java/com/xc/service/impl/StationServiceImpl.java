package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.StationMapper;
import com.xc.domain.Station;
import com.xc.dto.PageDto;
import com.xc.dto.StationDto;
import com.xc.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationMapper stationMapper;

    @Override
    public boolean savaTEmployee(Station station) {
        return this.stationMapper.insert(station)>0?true:false;
    }

    @Override
    public boolean deleteTEmployee(Integer id) {
        return this.stationMapper.deleteByPrimaryKey(id)>0?true:false;
    }

    @Override
    public boolean updateTEmployee(Station station) {
        return this.stationMapper.updateByPrimaryKey(station)>0?true:false;
    }

    @Override
    public PageInfo<Station> findTEmployee(StationDto stationDto) {
        PageHelper.startPage(stationDto.getPage(),stationDto.getPageSize());
        if(stationDto.getSname()!="" || stationDto.getLevels()!=null){
            List list=this.stationMapper.selectforname(stationDto.getSname(),stationDto.getLevels());
            PageInfo pageInfo=new PageInfo(list);
            return pageInfo;
        }else {
            List list=this.stationMapper.selectforname(null,null);
            PageInfo pageInfo=new PageInfo(list);
            return pageInfo;
        }

    }

    @Override
    public PageInfo<Station> findselect(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(),pageDto.getPageSize());
        List list=this.stationMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public List<Station> findStations() {
        return stationMapper.selectAll();
    }
}

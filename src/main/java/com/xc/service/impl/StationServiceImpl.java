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
import tk.mybatis.mapper.entity.Example;

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

    @Override
    public Station findStationsBySid(Integer sid) {
       Station station= stationMapper.selectByPrimaryKey(sid);

      return station;
    }
    @Override
    public List<Station> findStationsBySid2(Integer sid,String type) {
        if(type.equals("自动调度")){
            Station station=this.stationMapper.selectByPrimaryKey(sid);
            if(station.getLevels().toString().equals("0")){
                Example example=new Example(Station.class);
                example.createCriteria().andEqualTo("levels" ,0);
                List list=this.stationMapper.selectByExample(example);
                return list;
            }else{
                Example example=new Example(Station.class);
                example.createCriteria().andEqualTo("sid" ,station.getLevels());
                List list=this.stationMapper.selectByExample(example);
                return list;
            }
        }else{
            Example example=new Example(Station.class);
            example.createCriteria().andEqualTo("levels" ,sid);
            List list=this.stationMapper.selectByExample(example);
            return list;
        }
    }
}

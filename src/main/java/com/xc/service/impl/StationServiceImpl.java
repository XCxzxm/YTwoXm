package com.xc.service.impl;

import com.xc.dao.StationMapper;
import com.xc.domain.Station;
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

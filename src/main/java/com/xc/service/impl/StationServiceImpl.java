package com.xc.service.impl;

import com.xc.dao.StationMapper;
import com.xc.domain.Station;
import com.xc.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationMapper stationMapper;
    @Override
    public List<Station> findStations() {
        return stationMapper.selectAll();
    }
}

package com.xc.service;

import com.xc.domain.Station;

import java.util.List;

public interface StationService {
    public List<Station> findStations();
    public Station findStationsBySid(Integer sid);
    public List<Station> findStationsBySid2(Integer sid,String type);
}

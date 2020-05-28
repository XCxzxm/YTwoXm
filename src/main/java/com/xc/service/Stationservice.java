package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Station;
import com.xc.dto.PageDto;
import com.xc.dto.StationDto;

import java.util.List;

public interface StationService {
    public boolean savaTEmployee(Station station);

    public boolean deleteTEmployee(Integer id);

    public boolean updateTEmployee(Station station);

    public PageInfo<Station> findTEmployee(StationDto stationDto);

    public PageInfo<Station>findselect(PageDto pageDto);

    public List<Station> findStations();
}

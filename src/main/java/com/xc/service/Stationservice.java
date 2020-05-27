package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Station;
import com.xc.dto.PageDto;
import com.xc.dto.StationDto;

public interface Stationservice {
    public boolean savaTEmployee(Station station);

    public boolean deleteTEmployee(Integer id);

    public boolean updateTEmployee(Station station);

    public PageInfo<Station> findTEmployee(StationDto stationDto);

    public PageInfo<Station>findselect(PageDto pageDto);

}

package com.xc.controller;

import com.xc.domain.Station;
import com.xc.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("Station")
@RestController
public class StationController {
    @Autowired
    private StationService  stationService;
    @RequestMapping("findStations")
    public List<Station> findStations(){
        return this.stationService.findStations();
    }
}

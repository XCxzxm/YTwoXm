package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Station;
import com.xc.dto.MsgDto;
import com.xc.dto.PageDto;
import com.xc.dto.StationDto;
import com.xc.service.Stationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Station")
public class Stationcontroller {
    @Autowired
    private Stationservice stationservice;

    @RequestMapping("stationpage")
    public PageInfo<Station> stationpage(StationDto stationDto){
            PageInfo<Station> pageInfo=this.stationservice.findTEmployee(stationDto);
            return pageInfo;
    }

    @RequestMapping("findselect")
    public PageInfo<Station> findselect(PageDto pageDto){
        PageInfo<Station> pageInfo=this.stationservice.findselect(pageDto);
        return pageInfo;
    }

    @RequestMapping("stationsava")
    public MsgDto stationsava(@RequestBody Station station){
        this.stationservice.savaTEmployee(station);
        return new MsgDto(true,"添加成功");
    }

    @RequestMapping("stationdelete")
    public MsgDto stationdelete(Integer id){
        this.stationservice.deleteTEmployee(id);
        return new MsgDto(true,"删除成功");
    }

    @RequestMapping("stationupdate")
    public MsgDto stationupdate(@RequestBody Station station){
        this.stationservice.updateTEmployee(station);
        return new MsgDto(true,"修改成功");
    }

}

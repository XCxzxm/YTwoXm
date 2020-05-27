package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;
import com.xc.dto.MsgDto;
import com.xc.service.Flittingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Flitting")
public class Flittingcontroller {
    @Autowired
    private Flittingservice flittingservice;

    @RequestMapping("selectforname")
    public PageInfo<Flitting> selectforname(Integer page, Integer pageSize,Integer fid, Integer ftype, Integer oid){
        PageInfo pageInfo=this.flittingservice.selectforname(page, pageSize, fid, ftype, oid);
        return pageInfo;
    }

    @RequestMapping("updateFlitting")
    public MsgDto updateFlitting(@RequestBody Flitting flitting){
        this.flittingservice.updateFlitting(flitting);
        return new MsgDto(true,"已签收");
    }

}

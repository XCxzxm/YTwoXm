package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Stockchange;
import com.xc.dto.MsgDto;
import com.xc.service.Stockchangeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Stockchange")
public class Stockchangecontroller {
    @Autowired
    private Stockchangeservice stockchangeservice;

    @RequestMapping("addStockchange")
    public MsgDto addStockchange(@RequestBody Stockchange stockchange){
        this.stockchangeservice.addStockchange(stockchange);
        return new MsgDto(true,"生成完成");
    }

    @RequestMapping("findStockchange")
    public PageInfo<Stockchange> findStockchange(Integer page,Integer pageSize){
        PageInfo<Stockchange> pageInfo=this.stockchangeservice.findStockchange(page, pageSize);
        return pageInfo;
    }

    @RequestMapping("selectStockchange")
    public PageInfo<Stockchange> selectStockchange(Integer page, Integer pageSize,Integer mid, Integer sid, Integer stype){
        PageInfo<Stockchange> pageInfo=this.stockchangeservice.selectStockchange(page,pageSize,mid, sid, stype);
        return pageInfo;
    }

    @RequestMapping("updateStockchange")
    public MsgDto updateStockchange(@RequestBody Stockchange stockchange){
        this.stockchangeservice.updateStockchange(stockchange);
        return new MsgDto(true,"入库");
    }
    @RequestMapping("outupdateStockchange")
    public MsgDto outupdateStockchange(@RequestBody Stockchange stockchange){
        this.stockchangeservice.outupdateStockchange(stockchange);
        return new MsgDto(true,"出库");
    }
}

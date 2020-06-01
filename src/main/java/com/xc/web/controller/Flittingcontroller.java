package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;
import com.xc.domain.Orders;
import com.xc.dto.MsgDto;
import com.xc.service.FlittingService;
import com.xc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("Flitting")
public class Flittingcontroller {
    @Autowired
    private FlittingService flittingservice;

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

    @Autowired
    private OrdersService ordersService;
    @RequestMapping("addFlitting")
    public MsgDto addFlitting(Integer oid ,Integer sid,Integer pid){
        int dtid=1;
        Flitting flitting=new Flitting();
        Orders orders=ordersService.findOrdersById(oid);
        flitting.setOid(orders.getOid());
        flitting.setOutdate(new Date());
        flitting.setFtype(dtid);
        flitting.setFover("未签收");
        flitting.setFlitdate(new Date());
        flitting.setPid(pid);
        orders.setStatus(2);
        this.ordersService.changeOrderStruts(orders);
        this.flittingservice.addFlitting(flitting);
        return new MsgDto(true,"成功");
    }
    @RequestMapping("flittingList")
    public PageInfo flittingList(Integer pid,Integer page,Integer pagesize){
        return this.flittingservice.findFlittingByPid(pid,page,pagesize);
    }
    @RequestMapping("delectFlitting")
    public MsgDto delectFlitting(Integer fid){
        this.flittingservice.delectFlitting(fid);
        return new MsgDto(true,"成功");
    }

}

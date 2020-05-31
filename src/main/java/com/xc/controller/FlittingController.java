package com.xc.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;
import com.xc.domain.Orders;
import com.xc.dto.MsgDto;
import com.xc.service.FlittingService;
import com.xc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("Flitting")
@RestController
public class FlittingController {
    @Autowired
    private FlittingService flittingService;
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
        flitting.setFover("未处理");
        flitting.setFlitdate(new Date());
        flitting.setPid(pid);
        orders.setStatus(2);
        this.ordersService.changeOrderStruts(orders);
        this.flittingService.addFlitting(flitting);
        return new MsgDto(true,"成功");
    }
    @RequestMapping("flittingList")
    public PageInfo flittingList(Integer pid,Integer page,Integer pagesize){
        return this.flittingService.findFlittingByPid(pid,page,pagesize);
    }
    @RequestMapping("delectFlitting")
    public MsgDto delectFlitting(Integer fid){
        this.flittingService.delectFlitting(fid);
           return new MsgDto(true,"成功");
    }
}

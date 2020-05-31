package com.xc.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Orders;
import com.xc.service.OrdersService;
import com.xc.service.StationService;
import com.xc.service.impl.OrdersServiceImpl;
import com.xc.service.impl.StationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Order")
@RestController
public class OrdersController {
    @Autowired
    private OrdersServiceImpl ordersService;
    @Autowired
    private StationServiceImpl stationService;
    @RequestMapping("findOrderAll")
    public PageInfo<Orders> findOrderAll(Integer page,Integer pageSize,Integer sid){

        PageInfo<Orders> pageInfo=this.ordersService.findOrders(page,pageSize,stationService.findStationsBySid(sid).getSname());
        return pageInfo;
    };

}

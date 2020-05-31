package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Orders;
import com.xc.dto.MsgDto;
import com.xc.service.OrdersService;
import com.xc.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Order")
@RestController
public class OrdersController {
    @Autowired
    private OrdersServiceImpl ordersService;
@RequestMapping("findOrderAll")
    public PageInfo<Orders> findOrderAll(Integer page,Integer pageSize){
        PageInfo<Orders> pageInfo=this.ordersService.findOrders(page,pageSize);
        return pageInfo;
    }

    @RequestMapping("addOrder")
    public MsgDto addOrder(@RequestBody Orders orders){
    this.ordersService.addOrder(orders);
    return new MsgDto(true,"添加成功");
    }
}

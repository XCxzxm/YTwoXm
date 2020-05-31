package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Orders;

public interface OrdersService {
    public PageInfo<Orders> findOrders(Integer page,Integer pagesize,String sname);
    public Orders findOrdersById(int oid);
    public void changeOrderStruts(Orders orders);
}

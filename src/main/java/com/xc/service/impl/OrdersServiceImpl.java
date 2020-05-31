package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.OrdersMapper;
import com.xc.domain.Orders;
import com.xc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.Date;
import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public PageInfo<Orders> findOrders(Integer page, Integer pageSize,String sname) {
        Example example=new Example(Orders.class);
        example.createCriteria().andEqualTo("receivepost",sname).andEqualTo("status",1);

        PageHelper.startPage(page,pageSize);
        List list=ordersMapper.selectByExample(example);
     //   List list= this.ordersMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public Orders findOrdersById(int oid) {
        return this.ordersMapper.selectByPrimaryKey(oid);
    }

    @Override
    public void changeOrderStruts(Orders orders) {
        this.ordersMapper.updateByPrimaryKey(orders);
    }

    @Override
    public boolean addOrder(Orders orders) {
        Date date=new Date();
        orders.setCreatedate(date);
        orders.setStatus(1);
        return this.ordersMapper.insert(orders)>0?true:false;
    }
}

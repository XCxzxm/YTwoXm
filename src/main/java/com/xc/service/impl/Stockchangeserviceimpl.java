package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.StockchangeMapper;
import com.xc.domain.Stockchange;
import com.xc.service.Stockchangeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Stockchangeserviceimpl implements Stockchangeservice {
    @Autowired
    private StockchangeMapper stockchangeMapper;

    @Override
    public boolean addStockchange(Stockchange stockchange) {
        Date date=new Date();
        Integer ous=(date.getSeconds()+date.getMinutes())*3681;
        stockchange.setPid(ous);

        stockchange.setDid(ous+3921);

        stockchange.setMid(ous+6921);

        stockchange.setSdate(date);

        return this.stockchangeMapper.insert(stockchange)>0?true:false;
    }

    @Override
    public boolean updateStockchange(Stockchange stockchange) {
        stockchange.setStype(1);
        return this.stockchangeMapper.updateByPrimaryKey(stockchange)>0?true:false;
    }

    @Override
    public boolean outupdateStockchange(Stockchange stockchange) {
        stockchange.setStype(2);
        return this.stockchangeMapper.updateByPrimaryKey(stockchange)>0?true:false;
    }

    @Override
    public PageInfo<Stockchange> findStockchange(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List list=this.stockchangeMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Stockchange> selectStockchange(Integer page, Integer pageSize,Integer mid, Integer sid, Integer stype) {
        PageHelper.startPage(page,pageSize);
        List list=this.stockchangeMapper.selectforname(mid, sid, stype);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }


}

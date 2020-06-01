package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.BillMapper;
import com.xc.domain.Bill;
import com.xc.service.Billservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Billserviceimpl implements Billservice {
    @Autowired
    private BillMapper billMapper;

    @Override
    public PageInfo<Bill> selectbill(Integer page, Integer pageSize, Integer oid, Integer status) {
        PageHelper.startPage(page,pageSize);
        List list=this.billMapper.selectforname(oid, status);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean billupdate(Bill bill) {
        bill.setStatus(1);
        return this.billMapper.updateByPrimaryKey(bill)>0?true:false;
    }

    @Override
    public boolean billupdatepus(Bill bill) {
        bill.setStatus(2);
        return this.billMapper.updateByPrimaryKey(bill)>0?true:false;
    }

    @Override
    public boolean billsava(Bill bill) {
        return this.billMapper.insert(bill)>0?true:false;
    }
}

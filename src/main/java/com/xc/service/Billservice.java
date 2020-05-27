package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Bill;

public interface Billservice {
    public PageInfo<Bill> selectbill(Integer page, Integer pageSize,Integer oid, Integer status);

    public boolean billupdate(Bill bill);

    public boolean billupdatepus(Bill bill);

}

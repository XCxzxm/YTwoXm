package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Bill;
import com.xc.dto.MsgDto;
import com.xc.service.Billservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Bill")
public class Billcontroller {
    @Autowired
    private Billservice billservice;

    @RequestMapping("findbillpage")
    public PageInfo<Bill> findbillpage(Integer page, Integer pageSize, Integer oid, Integer status){
        PageInfo pageInfo=this.billservice.selectbill(page, pageSize, oid, status);
        return pageInfo;
    }

    @RequestMapping("billupdate")
    public MsgDto billupdate(@RequestBody Bill bill){
        this.billservice.billupdate(bill);
        return new MsgDto(true,"领取成功");
    }

    @RequestMapping("billupdatepus")
    public MsgDto billupdatepus(@RequestBody Bill bill){
        this.billservice.billupdatepus(bill);
        return new MsgDto(true,"已作废");
    }

    @RequestMapping("billsava")
    public MsgDto billsava(@RequestBody Bill bill){
        this.billservice.billsava(bill);
        return new MsgDto(true,"添加成功");
    }

}

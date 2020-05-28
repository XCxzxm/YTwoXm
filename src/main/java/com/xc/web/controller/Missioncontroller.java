package com.xc.web.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Employee;
import com.xc.domain.Mission;
import com.xc.domain.Receipt;
import com.xc.dto.MsgDto;
import com.xc.service.Employeeservice;
import com.xc.service.Missionservice;
import com.xc.service.Receiptservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Mission")
public class Missioncontroller {
    @Autowired
    private Missionservice missionservice;
    @Autowired
    private Receiptservice receiptservice;
    @Autowired
    private Employeeservice employeeservice;

    @RequestMapping("selectforname")
    public PageInfo<Mission> selectforname(Integer page,Integer pageSize,Integer mtype, Integer status, Integer eid,Integer mid){
        PageInfo pageInfo=this.missionservice.selectforname(page, pageSize, mtype, status, eid,mid);
        return pageInfo;
    }

    @RequestMapping("savaMission")
    public MsgDto savaMission(@RequestBody Mission mission){
        this.missionservice.savaMission(mission);
        return new MsgDto(true,"录入成功") ;
    }

    @RequestMapping("savaReceipt")
    public MsgDto savaReceipt(@RequestBody Receipt receipt){
        this.receiptservice.savaReceipt(receipt);
        return new MsgDto(true,"录入成功") ;
    }

    @RequestMapping("updateMission")
    public MsgDto updateMission(@RequestBody Mission mission){
        this.missionservice.updateMission(mission);
        return new MsgDto(true,"分配成功") ;
    }

    @RequestMapping("findemp")
    public List<Employee> findemp(){
        List list=this.employeeservice.findemp();
        return list;
    }
}

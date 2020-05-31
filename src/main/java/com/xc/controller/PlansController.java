package com.xc.controller;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Plans;
import com.xc.dto.MsgDto;
import com.xc.service.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("Plans")
@RestController
public class PlansController {
    @Autowired
    private PlansService plansService;
    @RequestMapping("addPlans")
    public Plans addPlans(Integer sid,Integer handle,String remark){
        Plans plans=new Plans();
        plans.setSid(sid);
        plans.setManagedate(new Date());
        plans.setAccount("未结算");
        plans.setHandle(handle);
        plans.setExecutestatus(1);
        plans.setRemark(remark);
        this.plansService.addPlan(plans);
        return plans;
    }
    @RequestMapping("findPlansAll")
    public PageInfo<Plans> findPlansAll(Integer page,Integer pageSize){
        PageInfo pageInfo=this.plansService.findPlansAll(page,pageSize);
        return  pageInfo;
    }
    @RequestMapping("delectPlan")
    public MsgDto delectPlan(Integer pid){
        this.plansService.delectPlan(pid);
        return new MsgDto(true,"成功");
    }
    @RequestMapping("findBySturts")
    public PageInfo findBySturts(Integer page,Integer pageSize,String struts){
        if(struts==""){
            return this.plansService.findPlansAll(page,pageSize);
        }else {
            return this.plansService.findBySturts(page, pageSize, struts);
        }
    }
    @RequestMapping("findById")
    public PageInfo findById(Integer pid){
        return this.plansService.findById(pid);
    }


}

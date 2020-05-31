package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.FlittingMapper;
import com.xc.dao.PlansMapper;
import com.xc.domain.Flitting;
import com.xc.domain.Plans;
import com.xc.service.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlansServiceImpl implements PlansService {
    @Autowired
    private PlansMapper plansMapper;
    @Autowired
    private FlittingMapper flittingMapper;
    @Override
    public void addPlan(Plans plans) {
//        Integer upid=345764;
//        upid++;
//        plans.setPid(upid);
        this.plansMapper.insert(plans);
    }

    @Override
    public PageInfo<Plans> findPlansAll(Integer page,Integer pagesize) {
        PageHelper.startPage(page,pagesize);
        String i="0";
        List list=this.plansMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean delectPlan(Integer pid) {
        return this.plansMapper.deleteByPrimaryKey(pid)>0?true:false;
    }
}

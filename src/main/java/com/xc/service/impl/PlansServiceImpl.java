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
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class PlansServiceImpl implements PlansService {
    @Autowired
    private PlansMapper plansMapper;
    @Autowired
    private FlittingMapper flittingMapper;
    @Override
    public void addPlan(Plans plans) {
        Date date=new Date();
        Integer ous=(date.getSeconds()+date.getMinutes())*3681;
        plans.setPid(ous);
        this.plansMapper.insert(plans);
    }

    @Override
    public PageInfo<Plans> findPlansAll(Integer page,Integer pagesize) {
        PageHelper.startPage(page,pagesize);
        List list=this.plansMapper.selectAll();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean delectPlan(Integer pid) {
        return this.plansMapper.deleteByPrimaryKey(pid)>0?true:false;
}

    @Override
    public PageInfo<Plans> findBySturts(Integer page, Integer pagesize, String sturts) {
        PageHelper.startPage(page,pagesize);
        Example example=new Example(Plans.class);
        example.createCriteria().andEqualTo("account",sturts);
        List list=this.plansMapper.selectByExample(example);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Plans> findById(Integer pid) {
        PageHelper.startPage(1,1);
       Example example=new Example(Plans.class);
       example.createCriteria().andEqualTo("pid",pid);
        List list=this.plansMapper.selectByExample(example);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }


}

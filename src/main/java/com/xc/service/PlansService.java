package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;
import com.xc.domain.Plans;

import java.util.List;

public interface PlansService {
    public void addPlan(Plans plans);
    public PageInfo<Plans> findPlansAll(Integer page,Integer pagesize);
    public boolean delectPlan(Integer pid);
    public PageInfo<Plans> findBySturts(Integer page,Integer pagesize,String sturts);
    public PageInfo<Plans> findById(Integer pid);
}

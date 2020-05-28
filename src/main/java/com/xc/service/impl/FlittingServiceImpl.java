package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.FlittingMapper;
import com.xc.domain.Flitting;
import com.xc.service.FlittingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FlittingServiceImpl implements FlittingService {
    @Autowired
    private FlittingMapper flittingMapper;

    @Override
    public PageInfo<Flitting> selectforname(Integer page, Integer pageSize, Integer fid, Integer ftype, Integer oid) {
        PageHelper.startPage(page,pageSize);

        List list=this.flittingMapper.selectforname(fid, ftype, oid);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;

    }

    @Override
    public boolean updateFlitting(Flitting flitting) {
        flitting.setFover("已签收");
        return this.flittingMapper.updateByPrimaryKey(flitting)>0?true:false;
    }

    @Override
    public boolean addFlitting(Flitting flitting) {
        return this.flittingMapper.insert(flitting)>0?true:false;
    }

    @Override
    public PageInfo<Flitting> findFlittingByPid(Integer pid,Integer page,Integer pagesize) {
        Example example=new Example(Flitting.class);
        example.createCriteria().andEqualTo("pid",pid);
        List list=flittingMapper.selectByExample(example);
        Integer i=list.size();
        PageHelper.startPage(page,pagesize);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean delectFlitting(Integer fid) {

        return this.flittingMapper.deleteByPrimaryKey(fid) > 0?true:false;
    }
}

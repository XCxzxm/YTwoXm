package com.xc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.dao.FlittingMapper;
import com.xc.domain.Flitting;
import com.xc.service.Flittingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Flittingserviceimpl implements Flittingservice {
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
}

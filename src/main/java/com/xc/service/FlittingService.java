package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;

public interface FlittingService {
    public boolean addFlitting(Flitting flitting);
    public PageInfo<Flitting> findFlittingByPid(Integer pid,Integer page,Integer pagesize);
    public boolean delectFlitting(Integer fid);
}

package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;

public interface FlittingService {
    public PageInfo<Flitting> selectforname(Integer page, Integer pageSize,Integer fid, Integer ftype, Integer oid);
    public boolean updateFlitting(Flitting flitting);
    public boolean addFlitting(Flitting flitting);
    public PageInfo<Flitting> findFlittingByPid(Integer pid,Integer page,Integer pagesize);
    public boolean delectFlitting(Integer fid);
}

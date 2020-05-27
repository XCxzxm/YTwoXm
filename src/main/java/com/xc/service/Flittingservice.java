package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Flitting;

public interface Flittingservice {
    public PageInfo<Flitting> selectforname(Integer page, Integer pageSize,Integer fid, Integer ftype, Integer oid);

    public boolean updateFlitting(Flitting flitting);
}

package com.xc.service;

import com.github.pagehelper.PageInfo;
import com.xc.domain.Stockchange;
import java.util.List;

public interface Stockchangeservice {
    public boolean addStockchange(Stockchange stockchange);

    public boolean updateStockchange(Stockchange stockchange);

    public boolean outupdateStockchange(Stockchange stockchange);

    public PageInfo<Stockchange> findStockchange(Integer page, Integer pageSize);

    public PageInfo<Stockchange> selectStockchange(Integer page, Integer pageSize, Integer mid, Integer sid, Integer stype);

}

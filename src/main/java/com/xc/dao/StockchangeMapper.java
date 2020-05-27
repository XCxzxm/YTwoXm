package com.xc.dao;

import com.xc.domain.Stockchange;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Repository
public interface StockchangeMapper extends Mapper<Stockchange> {
    @Select("select * from stockchange where mid=(case when #{mid} is null then mid else #{mid} end) and sid=(case when #{sid} is null then sid else #{sid} end) and stype=(case when #{stype} is null then stype else #{stype} end)")
    public List<Stockchange> selectforname(Integer mid, Integer sid,Integer stype);
}

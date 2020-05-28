package com.xc.dao;

import com.xc.domain.Bill;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface BillMapper extends Mapper<Bill> {
    @Select("select * from bill where oid=(case when #{oid} is null then oid else #{oid} end) and status=(case when #{status} is null then status else #{status} end)")
    public List<Bill> selectforname(Integer oid, Integer status);
}

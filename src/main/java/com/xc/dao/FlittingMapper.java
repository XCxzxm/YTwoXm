package com.xc.dao;

import com.xc.domain.Flitting;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface FlittingMapper extends Mapper<Flitting> {
    @Select("select * from flitting where fid=(case when #{fid} is null then fid else #{fid} end) and ftype=(case when #{ftype} is null then ftype else #{ftype} end) and oid=(case when #{oid} is null then oid else #{oid} end)")
    public List<Flitting> selectforname(Integer fid, Integer ftype, Integer oid);
}

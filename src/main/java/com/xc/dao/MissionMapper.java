package com.xc.dao;

import com.xc.domain.Mission;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Repository
public interface MissionMapper extends Mapper<Mission> {
    @Select("select * from mission where mtype=(case when #{mtype} is null then mtype else #{mtype} end) and status=(case when #{status} is null then status else #{status} end) and eid=(case when #{eid} is null then eid else #{eid} end) and mid=(case when #{mid} is null then mid else #{mid} end)")
    public List<Mission> selectforname(Integer mtype, Integer status, Integer eid, Integer mid);
}

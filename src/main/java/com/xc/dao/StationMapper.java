package com.xc.dao;

import com.xc.domain.Station;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface StationMapper extends Mapper<Station> {
   @Select("select * from station where sname=(case when #{sname} is null then sname else #{sname} end) and levels=(case when #{levels} is null then levels else #{levels} end)")
   public List<Station> selectforname(String sname,Integer levels);
}

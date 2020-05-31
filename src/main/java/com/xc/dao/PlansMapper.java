package com.xc.dao;

import com.xc.domain.Plans;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface PlansMapper extends Mapper<Plans> {
    public List<Plans> find();
}

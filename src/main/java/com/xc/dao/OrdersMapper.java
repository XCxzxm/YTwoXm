package com.xc.dao;

import com.xc.domain.Orders;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface OrdersMapper extends Mapper<Orders> {
}

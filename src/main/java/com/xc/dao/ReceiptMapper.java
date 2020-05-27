package com.xc.dao;

import com.xc.domain.Receipt;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ReceiptMapper extends Mapper<Receipt> {
}

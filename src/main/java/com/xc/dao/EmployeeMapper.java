package com.xc.dao;

import com.xc.domain.Employee;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface EmployeeMapper extends Mapper<Employee> {
}

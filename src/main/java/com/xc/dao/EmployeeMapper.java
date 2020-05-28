package com.xc.dao;

import com.xc.domain.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface EmployeeMapper extends Mapper<Employee> {
    @Select("select * from employee where ename=#{userName} and pwd=#{password}")
    public Employee login(String userName, String password);
}

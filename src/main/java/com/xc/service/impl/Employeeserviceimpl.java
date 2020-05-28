package com.xc.service.impl;

import com.xc.dao.EmployeeMapper;
import com.xc.domain.Employee;
import com.xc.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employeeserviceimpl implements Employeeservice {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findemp() {
        List list=this.employeeMapper.selectAll();
        return list;
    }

    @Override
    public Employee login(String userName, String password) {
        return this.employeeMapper.login(userName, password);
    }
}

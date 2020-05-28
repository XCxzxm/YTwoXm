package com.xc.service;

import com.xc.domain.Employee;

import java.util.List;

public interface Employeeservice {
    public List<Employee> findemp();

    public Employee login(String userName, String password);
}

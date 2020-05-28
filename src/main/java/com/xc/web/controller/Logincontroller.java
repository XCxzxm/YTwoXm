package com.xc.web.controller;

import com.xc.domain.Employee;
import com.xc.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Login")
@RestController
public class Logincontroller {
    @Autowired
    private Employeeservice employeeservice;

    @RequestMapping("logins")
    public Employee logins(String userName, String password){
        return this.employeeservice.login(userName, password);
    }
}

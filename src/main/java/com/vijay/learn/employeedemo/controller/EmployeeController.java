package com.vijay.learn.employeedemo.controller;
/*
Project : employee-demo
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 13 June 2020
*/

import com.vijay.learn.employeedemo.entity.Employee;
import com.vijay.learn.employeedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    @ResponseBody
    public List<Employee> getEmployee(){
        return employeeService.findAllEmployee();
    }
}

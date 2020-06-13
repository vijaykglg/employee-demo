package com.vijay.learn.employeedemo.service;
/*
Project : employee-demo
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 13 June 2020
*/

import com.vijay.learn.employeedemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    void save(Employee employee);
}

package com.vijay.learn.employeedemo.service;
/*
Project : employee-demo
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 13 June 2020
*/

import com.vijay.learn.employeedemo.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    void save(Role role);
}

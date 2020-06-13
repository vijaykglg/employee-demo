package com.vijay.learn.employeedemo.repository;
/*
Project : employee-demo
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 13 June 2020
*/

import com.vijay.learn.employeedemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}

package com.vijay.learn.employeedemo.bootstrap;
/*
Project : employee-demo
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 13 June 2020
*/

import com.vijay.learn.employeedemo.entity.Employee;
import com.vijay.learn.employeedemo.entity.Role;
import com.vijay.learn.employeedemo.service.EmployeeService;
import com.vijay.learn.employeedemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Component
public class BootStrapJPAData implements CommandLineRunner {
    private EmployeeService employeeService;
    private RoleService roleService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadEmployees();
        loadRoles();
        assignEmployeeToUserRole();
        assignEmployeeToAdminRole();
    }

    private void loadEmployees() {
        Employee employee = new Employee();
        employee.setFirstName("Vijay");
        employee.setLastName("Gupta");
        employee.setAge(36);
        this.employeeService.save(employee);

        employee = new Employee();
        employee.setFirstName("Sri");
        employee.setLastName("Raghu");
        employee.setAge(36);
        this.employeeService.save(employee);
        System.out.println("Employee Saved");
    }

    private void loadRoles() {
        Role role = new Role();
        role.setRole("ROLE_USER");
        role.setDescription("Normal user");
        this.roleService.save(role);

        role = new Role();
        role.setRole("ROLE_ADMIN");
        role.setDescription("Admin user");
        this.roleService.save(role);

        System.out.println("Role Saved");
    }

    private void assignEmployeeToUserRole() {
        List<Role> roles = roleService.findAll();
        List<Employee> employees = employeeService.findAllEmployee();

        roles.forEach(role -> {
            if (role.getRole().equalsIgnoreCase("ROLE_USER")) {
                employees.forEach(employee -> {
                    if (employee.getFirstName().equalsIgnoreCase("Vijay")) {
                        employee.addRole(role);
                        employeeService.save(employee);
                    }
                });
            }
        });
    }

    private void assignEmployeeToAdminRole() {
        List<Role> roles = roleService.findAll();
        List<Employee> employees = employeeService.findAllEmployee();
        roles.forEach(role -> {
            if (role.getRole().equalsIgnoreCase("ROLE_ADMIN")) {
                employees.forEach(employee -> {
                    if (employee.getFirstName().equals("Sri")) {
                        employee.addRole(role);
                        employeeService.save(employee);
                    }
                });
            }
        });
    }
}

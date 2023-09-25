package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.model.Department;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private int nextEmployeeId = 1;
    private int nextDepartmentId = 1;

    public void addEmployee(String name, String address, Department department) {
        int employeeId = nextEmployeeId++;
        Employee employee = new Employee(employeeId, name, address, department);
        employees.add(employee);
    }

    public void addDepartment(String name) {
        int departmentId = nextDepartmentId++;
        Department department = new Department(departmentId, name);
        departments.add(department);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Department> getAllDepartments() {
        return departments;
    }

}

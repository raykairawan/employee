package com.example.employee.model;


public class Employee {
    private int id;
    private String name;
    private String address;
    private Department department;

    public Employee(int id, String name, String address, Department department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }
}
package com.example.employee.view;

import com.example.employee.model.Employee;
import com.example.employee.model.Department;
import com.example.employee.controller.EmployeeController;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private EmployeeController employeeController;
    private Scanner scanner;

    public MainView(EmployeeController employeeController) {
        this.employeeController = employeeController;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Print Employee List");
            System.out.println("3. Add Department");
            System.out.println("4. Print Department List");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    printEmployeeList();
                    break;
                case 3:
                    addDepartment();
                    break;
                case 4:
                    printDepartmentList();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();
        printDepartments();
    }


    private void printEmployeeList() {
        List<Employee> employees = employeeController.getAllEmployees();
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Department: " + employee.getDepartment().getName());
            System.out.println();
        }
    }

    private void addDepartment() {
        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();
        employeeController.addDepartment(departmentName);
        System.out.println("Department added successfully.");
    }

    private void printDepartmentList() {
        List<Department> departments = employeeController.getAllDepartments();
        System.out.println("Department List:");
        for (Department department : departments) {
            System.out.println("ID: " + department.getId());
            System.out.println("Name: " + department.getName());
            System.out.println();
        }
    }

    private void printDepartments() {
        List<Department> departments = employeeController.getAllDepartments();
        System.out.println("Available Departments:");
        for (Department department : departments) {
            System.out.println("ID: " + department.getId() + ", Name: " + department.getName());
        }
    }

    private void exit() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }

}

package com.example.employee;

import com.example.employee.controller.EmployeeController;
import com.example.employee.view.MainView;

public class Main {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        MainView mainView = new MainView(employeeController);
        mainView.run();
    }
}

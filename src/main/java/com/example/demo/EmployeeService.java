package com.example.demo;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> getAllEmployees();
    Employee findEmployeeById(String id);
    void deleteEmployeeById(String id);
}

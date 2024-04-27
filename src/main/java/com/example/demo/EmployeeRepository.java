package com.example.demo;

import java.util.ArrayList;

public interface EmployeeRepository {
    ArrayList<Employee> getAllEmployees();
    Employee findById(String id);
    void deleteById(String id);
}

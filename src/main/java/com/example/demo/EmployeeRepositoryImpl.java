package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
//    private ArrayList<Employee> employees = new ArrayList<>();
    
    private ArrayList<Employee> employees;

    public EmployeeRepositoryImpl() {
        // Initialize the list of employees
        employees = new ArrayList<>();
        employees.add(new Employee("1", "John Doe", "123 Main St"));
        employees.add(new Employee("2", "Jane Smith", "456 Elm St"));
        // Add more employees as needed
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee findById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }


    @Override
    public void deleteById(String id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
}

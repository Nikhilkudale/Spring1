package com.example.demo;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee findEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }
}

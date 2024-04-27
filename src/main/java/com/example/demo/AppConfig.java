package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepositoryImpl();
    }

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository);
    }
}

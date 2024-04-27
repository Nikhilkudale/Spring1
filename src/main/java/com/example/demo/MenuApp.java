package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MenuApp {
    private final EmployeeService employeeService;

    public MenuApp(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        System.out.println("Hello Sir");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        MenuApp main = new MenuApp(employeeService);
        main.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("a. Print all employees");
            System.out.println("b. Search employee by id");
            System.out.println("c. Delete employee by id");
            System.out.println("x. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "a":
                    // Print all employees
                    employeeService.getAllEmployees().forEach(System.out::println);
                    break;
                case "b":
                    System.out.print("Enter employee id: ");
                    String id = scanner.nextLine();
                    // Search employee by id
                    System.out.println(employeeService.findEmployeeById(id));
                    break;
                case "c":
                    System.out.print("Enter employee id to delete: ");
                    String deleteId = scanner.nextLine();
                    // Delete employee by id
                    employeeService.deleteEmployeeById(deleteId);
                    System.out.println("Employee with ID " + deleteId + " deleted.");
                    break;
                case "x":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

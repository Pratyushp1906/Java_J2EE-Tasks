package com.wipro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.config.SpringConfig;
import com.wipro.dao.EmployeeDAO;
import com.wipro.entity.Employee;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Get EmployeeDAO bean
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        // Insert a new Employee
        Employee emp = new Employee();
        emp.setEmpname("Kumar"); // Only set name, ID is auto-generated

        employeeDAO.saveEmployee(emp);
        System.out.println("Employee Inserted Successfully: " + emp);

        // Close the context
        context.close();
    }
}
package com.wipro.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EmpTaskManSys {
	  HashMap<Integer, Employee> employees = new HashMap<>();
	     HashMap<Integer, List<Task>> employeeTasks = new HashMap<>();
	     PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
	     LinkedList<Task> pendingTasks = new LinkedList<>();

	    // Method to add an employee
	    public void addEmployee(Employee employee) {
	        employees.put(employee.getId(), employee);
	        employeeTasks.put(employee.getId(), new ArrayList<>()); // Initialize task list for the employee
	    }

	    // Method to assign a task to an employee
	    public void assignTask(int employeeId, Task task) {
	        if (!employees.containsKey(employeeId)) {
	            System.out.println("Employee with ID " + employeeId + " does not exist.");
	            return;
	        }

	        // Add task to employee's task list
	        employeeTasks.get(employeeId).add(task);

	        // Add task to priority queue
	        priorityQueue.add(task);

	        // Add task to pending tasks if status is Pending
	        if ("Pending".equalsIgnoreCase(task.getStatus())) {
	            pendingTasks.add(task);
	        }

	        System.out.println("Task assigned to Employee ID " + employeeId + ": " + task);
}
	    public void retrieveTasksByPriority() {
	        System.out.println("\nTasks sorted by priority:");
	        PriorityQueue<Task> tempQueue = new PriorityQueue<>(priorityQueue); // Temporary queue to iterate
	        while (!tempQueue.isEmpty()) {
	            System.out.println(tempQueue.poll());
	        }
	    }

	    // Method to retrieve tasks by employee name or department
	    public void retrieveTasksByCriteria(String employeeName, String department) {
	        System.out.println("\nTasks for Employee Name: " + employeeName + " or Department: " + department);
	        for (Map.Entry<Integer, List<Task>> entry : employeeTasks.entrySet()) {
	            Employee employee = employees.get(entry.getKey());
	            if (employee != null && (employee.getName().equalsIgnoreCase(employeeName) || employee.getDepartment().equalsIgnoreCase(department))) {
	                System.out.println("Employee: " + employee);
	                for (Task task : entry.getValue()) {
	                    System.out.println(task);
	                }
	            }
	        }
}
	    public void removeCompletedTasks() {
	        System.out.println("\nRemoving completed tasks...");
	        Iterator<Task> iterator = pendingTasks.iterator();
	        while (iterator.hasNext()) {
	            Task task = iterator.next();
	            if ("Completed".equalsIgnoreCase(task.getStatus())) {
	                iterator.remove(); // Remove from pendingTasks
	                priorityQueue.remove(task); // Remove from priority queue
	            }
	        }

	        // Remove completed tasks from employee task lists
	        for (List<Task> tasks : employeeTasks.values()) {
	            tasks.removeIf(task -> "Completed".equalsIgnoreCase(task.getStatus()));
	        }

	        System.out.println("Completed tasks removed.");
	    }

	    // Method to display all pending tasks
	    public void displayPendingTasks() {
	        System.out.println("\nPending Tasks:");
	        for (Task task : pendingTasks) {
	            System.out.println(task);
	        }
	    }
	    public static void main(String[] args) {
	        EmpTaskManSys system = new EmpTaskManSys();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Employee Task Management System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Assign Task");
	            System.out.println("3. Retrieve Tasks by Priority");
	            System.out.println("4. Retrieve Tasks by Employee Name/Department");
	            System.out.println("5. Remove Completed Tasks");
	            System.out.println("6. Display Pending Tasks");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int empId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Employee Name: ");
	                    String empName = scanner.nextLine();
	                    System.out.print("Enter Employee Department: ");
	                    String empDept = scanner.nextLine();
	                    system.addEmployee(new Employee(empId, empName, empDept));
	                    break;

	                case 2:
	                    System.out.print("Enter Employee ID to assign task: ");
	                    int taskEmpId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Task ID: ");
	                    int taskId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Task Description: ");
	                    String taskDesc = scanner.nextLine();
	                    System.out.print("Enter Task Priority (1 = High, 2 = Medium, 3 = Low): ");
	                    int priority = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Task Status (Pending/Completed): ");
	                    String status = scanner.nextLine();
	                    system.assignTask(taskEmpId, new Task(taskId, taskDesc, priority, status));
	                    break;

	                case 3:
	                    system.retrieveTasksByPriority();
	                    break;

	                case 4:
	                    System.out.print("Enter Employee Name (or press Enter to skip): ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Department (or press Enter to skip): ");
	                    String department = scanner.nextLine();
	                    system.retrieveTasksByCriteria(name, department);
	                    break;

	                case 5:
	                    system.removeCompletedTasks();
	                    break;

	                case 6:
	                    system.displayPendingTasks();
	                    break;

	                case 7:
	                    System.out.println("Exiting system...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}

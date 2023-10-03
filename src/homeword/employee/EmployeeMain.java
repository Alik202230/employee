package homeword.employee;

import java.util.Scanner;

public class EmployeeMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    EmployeeDB database = new EmployeeDB();
    Employee employee = null;

    boolean isRunning = true;

    while (isRunning) {
      System.out.println("Please enter 0 for EXIT");
      System.out.println("Please enter 1 for CREATE EMPLOYEE");
      System.out.println("Please enter 2 for SEARCH ALL EMPLOYEE");
      System.out.println("Please enter 3 for SEARCH EMPLOYEE BY ID");
      System.out.println("Please enter 4 for SEARCH BY COMPANY NAME");
      String command = scanner.nextLine();

      switch (command) {
        case "0" -> {
          isRunning = false;
          System.out.println("----------------------------");
          System.out.println("Program is stopped");
          System.out.println("----------------------------");
        }
        case "1" -> {
          System.out.println("Please enter id");
          int id = Integer.parseInt(scanner.nextLine());
          System.out.println("Please enter name");
          String name = scanner.nextLine();
          System.out.println("Please enter surname");
          String surname = scanner.nextLine();
          System.out.println("Please enter salary");
          double salary = Double.parseDouble(scanner.nextLine());
          System.out.println("Please enter Company");
          String company = scanner.nextLine();
          System.out.println("Please enter position");
          String position = scanner.nextLine();
          employee = new Employee(id, name, surname, salary, company, position);
          database.createEmployee(employee);
          System.out.println("----------------------------");
          System.out.println("STATUS 201: New employee has been created successfully");
          System.out.println("----------------------------");
        }
        case "2" -> {
          if (employee != null) {
            System.out.println("----------------------------");
            database.getAllEmployees();
            System.out.println("----------------------------");
          } else {
            System.out.println("----------------------------");
            System.out.println("Database is currently empty please add employee");
            System.out.println("----------------------------");
          }
        }
        case "3" -> {
          System.out.println("Enter ID");
          int id = Integer.parseInt(scanner.nextLine());
          System.out.println("----------------------------");
           database.getEmployeeById(id);
          System.out.println("----------------------------");
        }
        case "4" -> {
          System.out.println("Search Company");
          String companyName = scanner.nextLine();
          System.out.println("----------------------------");
          database.getEmployeeByCompanyName(companyName);
          System.out.println("----------------------------");
        }
      }

    }

  }

}

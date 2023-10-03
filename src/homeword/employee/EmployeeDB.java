package homeword.employee;

public class EmployeeDB {

  private Employee[] employees = new Employee[2];
  private int size = 0;

  public void createEmployee(Employee employee) {
    if (size == employees.length) {
      resize();
    }
    employees[size++] = employee;
  }

  public void getAllEmployees() {
    for (int i = 0; i < size; i++) {
      System.out.println(STR."\n ID: \{employees[i].getId()}, \n Name: \{employees[i].getName()} \n Surname: \{employees[i].getSurName()} \n Salary: \{employees[i].getSalary()} \n Company: \{employees[i].getCompany()} \n Position: \{employees[i].getPosition()}");
    }
  }


  public void getEmployeeById(int id) {
    for (int i = 0; i < size; i++) {
      if (employees[i].getId() == id) {
        System.out.println(STR." \n ID: \{employees[i].getId()}, \n Name: \{employees[i].getName()} \n Surname: \{employees[i].getSurName()} \n Salary: \{employees[i].getSalary()} \n Company: \{employees[i].getCompany()} \n Position: \{employees[i].getPosition()}");
      } else {
        System.out.println(STR."ERROR 404! Employee with the ID of \{id} not found. Please try again...");
      }
    }
  }

  public void getEmployeeByCompanyName(String companyName) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (employees[i].getCompany().contains(companyName)) {
        System.out.println(STR." \n ID: \{employees[i].getId()}, \n Name: \{employees[i].getName()} \n Surname: \{employees[i].getSurName()} \n Salary: \{employees[i].getSalary()} \n Company: \{employees[i].getCompany()} \n Position: \{employees[i].getPosition()}");
        count++;
      }
    }
    System.out.println(STR."\n found \{count}");
  }

  private void resize() {
    Employee[] newEmployee = new Employee[employees.length + 1];
    for (int i = 0; i < size; i++) {
      newEmployee[i] = employees[i];
    }
    employees = newEmployee;
  }

}

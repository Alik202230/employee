package homeword.employee;

public class Employee {
  private int id;
  private String name;
  private String surName;
  private double salary;
  private String company;
  private String position;

  public Employee() {
  }

  public Employee(int id, String name, String surName, double salary, String company, String position) {
    this.id = id;
    this.name = name;
    this.surName = surName;
    this.salary = salary;
    this.company = company;
    this.position = position;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}

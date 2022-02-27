package com.teksystem.models;

public class Employee {
    // Variables
    private long employeeId;
    private long employeePhone;
    private String employeeName;
    private String employeeAddress;
    private double basicSalary;
    private double specialAllowance = 250.80;
    private double Hra= 1000.50;
    private double salary;
    // Variables


    // Constructor
    public Employee(long employeeId, long employeePhone, String employeeName, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeePhone = employeePhone;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public Employee() {

    }
    // Constructor


    // Methods
    public void calculateSalary(double basicSalary, double specialAllowance, double hra){
        double salary = basicSalary + (basicSalary * (specialAllowance/100)) +
                (basicSalary * (hra/100));
        System.out.printf("The calculated salary is: %f\n", salary);
    }

    public void calculateTransportAllowance(double basicSalary){
        double transportAllowance = 10/ (100*basicSalary);
        System.out.printf("The transport allowance for this employee is: %f\n", transportAllowance);
    }
    // Methods


    // Get and Set
    public long getEmployeeId() {
        return employeeId;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public double getHra() {
        return Hra;
    }
// Get and Set
}

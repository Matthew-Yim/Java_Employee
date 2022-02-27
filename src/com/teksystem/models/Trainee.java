package com.teksystem.models;

public class Trainee extends Employee{
    public Trainee(long employeeId, long employeePhone, String employeeName, String employeeAddress, Double salary) {
        super(employeeId, employeePhone, employeeName, employeeAddress);
        setBasicSalary(salary);
    }

    public Trainee() {
        super();
    }
}

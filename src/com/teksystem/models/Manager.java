package com.teksystem.models;

public class Manager extends Employee{
    public Manager(long employeeId, long employeePhone, String employeeName, String employeeAddress, Double salary) {
        super(employeeId, employeePhone, employeeName, employeeAddress);
        setBasicSalary(salary);
    }
    @Override
    public void calculateTransportAllowance(double basicSalary){
        double transportAllowance = (15*basicSalary)/100;
        System.out.printf("The transport allowance for this employee is: %f\n", transportAllowance);
    }
}

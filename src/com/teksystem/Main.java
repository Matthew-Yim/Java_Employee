package com.teksystem;

import com.teksystem.models.Manager;
import com.teksystem.models.Trainee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager m1 = new Manager(126534, 237844,
                                 "Peter", "Chennai India", 65000.0);
        Trainee t1 = new Trainee();
        t1.setEmployeeId(29846);
        t1.setEmployeeName("Jack");
        t1.setEmployeeAddress(" Mumbai India");
        t1.setEmployeePhone(442085);
        t1.setBasicSalary(45000.0);
        double t1_basicSalary = t1.getBasicSalary();
        double t1_specialAllowance = t1.getSpecialAllowance();
        double t1_hra = t1.getHra();

        m1.calculateSalary(m1.getBasicSalary(), m1.getSpecialAllowance(), m1.getHra());
        t1.calculateSalary(t1_basicSalary, t1_specialAllowance, t1_hra);

        m1.calculateTransportAllowance(m1.getBasicSalary());
        t1.calculateTransportAllowance(t1_basicSalary);
    }
}

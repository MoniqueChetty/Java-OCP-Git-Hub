package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {
       
        Engineer emp101 = new Engineer (101, "Jane Smith", "012-34-5678",120_345.27);
        Manager emp207 = new Manager (207, "Barbara Johnson", "054-12-23-67", 109_501.36, "US Marketing");
        Admin emp304 = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director emp12 = new Director(12, "Susan Wheeler", "099-45-2340",120_567.36, "Global Marketing", 1_000_000.00);
        
        emp101.printEmployee();
        emp207.printEmployee();
        emp304.printEmployee();
        emp12.printEmployee();
        
        System.out.println("");
        System.out.println("Change name");
        emp207.setName("Babe Johns");
        emp207.printEmployee();
        
        System.out.println("");
        System.out.println("Increase Salary Susan Wheeler 120_567.36 add 15_555");
        emp12.raiseSalary(15_555);
        emp12.printEmployee();
        
    }
    
}
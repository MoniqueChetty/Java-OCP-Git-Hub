package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;        
    }
    public String getName() {
        return name;
    }
    public int getEmpId() {
        return empId;
    }


    public void setName(String name) {
        if (name !=null && !name.equals("")){
        this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    /**
     *
     * @param increase
     */
    public void raiseSalary(double increase){
        if (increase > -1){
        this.salary += increase;
        }
    }
    public void printEmployee(){
        System.out.println("");
        System.out.println("Employee ID:        "+ getEmpId());
        System.out.println("Employee Name:      "+ getName());
        System.out.println("Employee SSN:       "+ getSsn());
        System.out.println("Employee Salary:    "+ NumberFormat.getCurrencyInstance().format((double)getSalary()));
    }
   
}

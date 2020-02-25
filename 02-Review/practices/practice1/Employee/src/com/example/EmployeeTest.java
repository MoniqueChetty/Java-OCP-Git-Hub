package com.example;

import com.example.domain.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sales
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Jane Smith");
        emp.setEmployeeSSN("012-34-5678");
        emp.setEmployeeSalary(120_345.27);
        
        System.out.println(" Employee ID:       " + emp.getEmployeeId());
        System.out.println(" Employee Name:     " + emp.getEmployeeName());
        System.out.println(" Employee SSN:      " + emp.getEmployeeSSN());
        System.out.println(" Employee Salary:   " + emp.getEmployeeSalary());
        
        Employee emp102 = new Employee();
        emp102.setEmployeeId(102);
        emp102.setEmployeeName("Alex Andrews");
        emp102.setEmployeeSSN("017-84-5878");
        emp102.setEmployeeSalary(130_345.27);
        
        System.out.println(" ");
        System.out.println(" Employee ID:       " + emp102.getEmployeeId());
        System.out.println(" Employee Name:     " + emp102.getEmployeeName());
        System.out.println(" Employee SSN:      " + emp102.getEmployeeSSN());
        System.out.println(" Employee Salary:   " + emp102.getEmployeeSalary());
    }
    
}
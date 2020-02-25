/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author Sales
 */
public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeSSN;
    private double employeeSalary;
    
    public Employee(){

    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeSSN
     */
    public String getEmployeeSSN() {
        return employeeSSN;
    }

    /**
     * @param employeeSSN the employeeSSN to set
     */
    public void setEmployeeSSN(String employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    /**
     * @return the employeeSalary
     */
    public double getEmployeeSalary() {
        return employeeSalary;
    }

    /**
     * @param employeeSalary the employeeSalary to set
     */
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
}


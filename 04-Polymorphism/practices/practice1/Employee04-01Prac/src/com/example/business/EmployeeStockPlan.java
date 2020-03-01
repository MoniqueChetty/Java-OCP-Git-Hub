/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

/**
 *
 * @author Monique
 */
public class EmployeeStockPlan {
    
    private final int stockDirector = 1000;
    private final int stockManager = 100;
    private final int stockEmployee = 10;
    
    public int grantstock(Employee empId){
        if (empId instanceof Director){
            return stockDirector;
        }else if (empId instanceof Manager){
            return stockManager;
        }else
            return stockEmployee;
    }
    
}

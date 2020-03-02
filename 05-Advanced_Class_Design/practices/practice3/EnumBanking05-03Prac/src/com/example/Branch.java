/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Sales
 */
public enum Branch {
    
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");
    
    private String serviceLevel;
    
    private Branch(String serviceLevel){
        this.serviceLevel = serviceLevel;
    }

    /**
     * @return the serviceLevel
     */
    public String getServiceLevel() {
        return serviceLevel;
    }   
}


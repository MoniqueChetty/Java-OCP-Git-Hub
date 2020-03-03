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
public class Cat extends Animal implements Pet{
    private String name;
    
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("Fluffy");
    }
    @Override
    public void play(){
        System.out.println(name +" likes to play with string.");
    }
    @Override
    public void eat(){
        System.out.println("Cats like to eat spiders and fish.");
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}

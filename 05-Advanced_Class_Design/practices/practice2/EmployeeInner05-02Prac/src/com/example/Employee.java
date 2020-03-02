package com.example;

public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;
    
    private BenefitHelper benH = new BenefitHelper();
    
    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public class BenefitHelper{
        private final double bonusRate = 0.02;
        private final double withholdingRate = 0.07;
        
        protected double calcBonus (double salary){
            return salary * bonusRate;
        }
        protected double calcWitholding(double salary){
            return salary * withholdingRate;
        }
    }
    
       /**
         * @return the bonusRate
         */
        public double getBonusRate() {
            return benH.calcBonus(salary);
        }

        /**
         * @return the withholdingRate
         */
        public double getWithholdingRate() {
            return benH.calcWitholding(salary);
        }
}



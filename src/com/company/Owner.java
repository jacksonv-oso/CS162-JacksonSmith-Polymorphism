//package com.company;

import java.util.ArrayList;
public class Owner {
    //Instance Variables
    private String name;
    private double baseSalary;

    //Constructor
    Owner(){
        name = "";
        baseSalary = 0;
    }
    Owner(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

//    Owner Methods
    public static void giveRaise(){
        //I want to get the baseSalary of all employees and multiply it by 1.25
        //I don't want to call a new employee object because it would only = 0 if run.
        Employee employee = new Employee();
        employee.getBaseSalary()*1.25;
    }

}

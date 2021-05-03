package com.ossovita.company;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(){

    }

    public Employee(String name, LocalDate hireDate){
        disAllowNullArgs(name,hireDate); //girilen parametrelerin boş olup olmadığını kontrol eder
        this.name=name;
        this.hireDate=hireDate;
    }

    public String getName(){
        return name; //this.name'  de yazılabilir.
    }

    public LocalDate getHireDate(){
        return hireDate;
    }

    public abstract double monthlyPay();

    @Override
    public String toString(){
        return name + " " + hireDate;
    }


    public void disAllowNullArgs(Object... args){
        for(Object arg : args)
            if(args==null)
                throw new IllegalArgumentException("Null Arguments");
    }


}

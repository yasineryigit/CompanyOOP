package com.ossovita.company;

import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private LocalDate hireDate;

    public Employee(){

    }

    public Employee(String name, LocalDate hireDate){
        Utils.disAllowNullArgs(name,hireDate); //girilen parametrelerin boş olup olmadığını kontrol eder
        this.name=name;
        this.hireDate=hireDate;
    }

    @Override
    public int compareTo(Employee other){
        return this.hireDate.compareTo(other.hireDate);
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




}

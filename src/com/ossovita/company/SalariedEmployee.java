package com.ossovita.company;

import java.time.LocalDate;

public class SalariedEmployee  extends Employee{
    private double annualSalary;
    private final static int MONTH = 12;

    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary){
        super(name,hireDate); //Employee'yi extend ettiğimiz için onun constructor'ını super() ile çağırmalıyız
        Utils.disallowZerosAndNegatives(annualSalary);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public double monthlyPay(){
        return annualSalary/MONTH;
    }




    /*
    public String toString(){
        return super.toString()+" "+annualSalary;
    }*/


}

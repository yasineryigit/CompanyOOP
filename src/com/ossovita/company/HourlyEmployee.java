package com.ossovita.company;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double monthlyHours; //Aylık çalışma saati
    private double hourlyWage; //Saatlik ücret

    public HourlyEmployee(String name,LocalDate hireDate){
        this(name,hireDate,200.0,20.0);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double monthlyHours, double hourlyWage){
        super(name,hireDate);
        Utils.disallowZerosAndNegatives(hourlyWage,monthlyHours); //verilen değerler sıfırdan küçük veya eşitse exception fırlat
        this.monthlyHours=monthlyHours;
        this.hourlyWage=hourlyWage;

    }

    public double getMonthlyHours() {
        return monthlyHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double monthlyPay(){
        return hourlyWage*monthlyHours;
    }



    @Override
    public String toString(){
        return super.toString() + " " + monthlyHours + " " + hourlyWage;
    }



}

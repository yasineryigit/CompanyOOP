package com.ossovita.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
        employees.add(new HourlyEmployee("Ali", LocalDate.of(2021, 06, 01), 200, 20));
        employees.add(new SalariedEmployee("Cem", LocalDate.of(2021, 06, 01), 20000));
        employees.add(new SalariedEmployee("Faruk", LocalDate.of(2021, 06, 01), 40000));
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public double monthlyPayroll() {
        double payroll = 0.0;
        for (Employee employee : employees) {
            payroll+=employee.monthlyPay();
        }
        return payroll;
    }

    public static void main(String[] args) {

        Company myCompany = new Company();

        myCompany.printEmployees();
        System.out.println("Monthly Payroll: " + myCompany.monthlyPayroll());

        //SalariedEmployee cem = new SalariedEmployee("Cem", LocalDate.of(2021,06,01),-10);
        //Employee can = new Employee(null,null);
        /*Object ob = new HourlyEmployee("can", LocalDate.of(2021, 6, 1), 10, 10);
        HourlyEmployee veli = (HourlyEmployee) ob;
        System.out.println(ob.toString());*/
        /*
        Object ob = new HourlyEmployee("can",LocalDate.of(2021,06,01),200,20);
        if(ob instanceof HourlyEmployee){
            HourlyEmployee ali = (HourlyEmployee) ob;
            System.out.println(ali.toString());
        }else{
            System.out.println(ob.toString() + " is not instance of HourlyEmployee");
        }*/


    }


}

package com.ossovita.company;

import java.time.LocalDate;
import java.util.*;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
        employees.add(new HourlyEmployee("Ali", LocalDate.of(2019, 06, 01), 200, 20));
        employees.add(new SalariedEmployee("Cem", LocalDate.of(2017, 06, 01), 20000));
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
            payroll += employee.monthlyPay();
        }
        return payroll;
    }

    public static void main(String[] args) {
        /*Employee ahmet = new HourlyEmployee("Cem", LocalDate.of(2010, 06, 01));
        Employee mehmet = new HourlyEmployee("Cem", LocalDate.of(2015, 06, 01));
        Employee hüseyin = new HourlyEmployee("Cem", LocalDate.of(2020, 06, 01));
        Employee ali = new HourlyEmployee("Ali", LocalDate.of(2025, 01, 01));
        Employee cem = new HourlyEmployee("Cem", LocalDate.of(2030, 06, 01));

        employees.add(ali);
        employees.add(cem);
        employees.add(ahmet);
        employees.add(mehmet);
        employees.add(hüseyin);*/

        Company myCompany = new Company();
        System.out.println(myCompany.toString());
        myCompany.sort();
        System.out.println(myCompany.toString());


    }

    public void sort() {
        Collections.sort(employees);
    }

    public String toString(){
        return employees.toString();
    }
}




/*
    public static List<Employee> sortEmployees(List<Employee> employees){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHireDate().compareTo(o2.getHireDate());
            }
        });
        return employees;
    }*/

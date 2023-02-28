package assignment8;

import java.util.*;
class Employee{
     int hrs;
    int rate;
    public Employee(){

    }
    public Employee(int hrs,int rate){
        this.hrs = hrs;
        this.rate = rate;
    }
    public void computeSalary(){
        System.out.println("This Employee method computes Salary");
        int salary = hrs*rate;
        System.out.println("salary of employee is: "+salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class WageEmployee extends Employee{
      WageEmployee(int hrs,int rate){
          super.rate = rate;
          super.hrs = hrs;
          super.computeSalary();
      }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class SalesPerson extends WageEmployee{
    int sales=0;
    int commission=0;
    SalesPerson(int hrs,int rate,int sales,int com){
        super(hrs,rate);
        this.sales=sales;
        this.commission=com;
    }

    @Override
    public void computeSalary() {
        System.out.println("Salary of SalesPerson ::"+(sales*commission+hrs*rate));
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "sales=" + sales +
                ", commission=" + commission +
                ", hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class Manager extends Employee{
    String managerName = "Ram";
    int fixedSalary = 0;
    int incentives = 0;
    Manager(int fixedSalary,int incentives){
        super();
        this.fixedSalary = fixedSalary;
        this.incentives = incentives;
    }

    @Override
    public void computeSalary() {
        super.computeSalary();
        System.out.println("Manager name is: "+managerName);
        System.out.println("Salary of Manager: "+(fixedSalary+incentives));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerName='" + managerName + '\'' +
                ", fixedSalary=" + fixedSalary +
                ", incentives=" + incentives +
                ", hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
public class InheritanceQuestions {
    public static void main(String[] args) {

         WageEmployee wageEmployee = new WageEmployee(12,1000);
         wageEmployee.computeSalary();
        System.out.println(wageEmployee.toString());

        SalesPerson salesPerson = new SalesPerson(12,1000,50,100);
        salesPerson.computeSalary();
        System.out.println(salesPerson.toString());

        Manager manager = new Manager(50000,10000);
        manager.computeSalary();
        System.out.println(manager.toString());


        //Question4
        Employee [] employees = new Employee[3];
        employees[0]= new Employee(5,600);
        employees[1]= new Employee(6,900);
        employees[2]= new Employee(12,2000);
        employees[0].computeSalary();
        employees[1].computeSalary();
        employees[2].computeSalary();

    }
}

/*
This Employee method computes Salary
salary of employee is: 12000
This Employee method computes Salary
salary of employee is: 12000
WageEmployee{hrs=12, rate=1000}
This Employee method computes Salary
salary of employee is: 12000
Salary of SalesPerson ::17000
SalesPerson{sales=50, commission=100, hrs=12, rate=1000}
This Employee method computes Salary
salary of employee is: 0
Manager name is: Ram
Salary of Manager: 60000
Manager{managerName='Ram', fixedSalary=50000, incentives=10000, hrs=0, rate=0}
This Employee method computes Salary
salary of employee is: 3000
This Employee method computes Salary
salary of employee is: 5400
This Employee method computes Salary
salary of employee is: 24000

 */
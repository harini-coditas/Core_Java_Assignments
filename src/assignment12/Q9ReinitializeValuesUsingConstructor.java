package assignment12;

import java.util.*;
class Employee{
    int empId = 13;
    String empName = "Harini";
    int empSal = 4900;
    String empAddress = "Pune, Maharastra";
    Employee(){
        System.out.println("Before reinitializing: "+empId+","+empName+","+empSal+","+empAddress);
    }
    Employee(int empId){
        this.empId = empId;
        System.out.println("After reinitializing: "+empId);
    }
    Employee(int empId,String empName,int empSal,String empAddress){
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.empAddress = empAddress;
        System.out.println("After reinitializing: "+empId+","+empName+","+empSal+","+empAddress);
    }
}
public class Q9ReinitializeValuesUsingConstructor {
    public static void main(String[] args) {
        Employee employeeTest1 = new Employee();
        Employee employeeTest2 = new Employee(1,"Harini Bathini",11000,"Viman nagar, Pune, Maharastra, India");
    }
}

/*
Before reinitializing: 13,Harini,4900,Pune, Maharastra
After reinitializing: 1,Harini Bathini,11000,Viman nagar, Pune, Maharastra, India

 */
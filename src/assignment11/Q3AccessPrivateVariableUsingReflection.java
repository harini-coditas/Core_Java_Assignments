package assignment11;
import java.lang.reflect.Method;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
class Employee{
    private int empId = 0;
    private String empName = "";
    Employee(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class Q3AccessPrivateVariableUsingReflection {
    public static void main(String[] args) {
//        Employee employee = new Employee(1,"Harini");
//        System.out.println(employee.getEmpId()+","+employee.getEmpName());
        try{
            Employee employee = new Employee(1,"Harini");
            Field privateMethod = Employee.class.getDeclaredField("empId");
            privateMethod.setAccessible(true);
            int empId = (int)privateMethod.get(employee);
            System.out.println("After using reflection, empId: "+empId);
            Field privateField1 = Employee.class.getDeclaredField("empName");
            privateField1.setAccessible(true);
            String empName = (String)privateField1.get(employee);
            System.out.println("After using reflection, empName: "+empName);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
/*
After using reflection, empId: 1
After using reflection, empName: Harini

 */
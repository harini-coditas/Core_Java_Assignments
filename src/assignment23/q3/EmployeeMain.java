package assignment23.q3;

import evaluation6.Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class EmployeeMain {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static EmpOperations operations = new EmpOperations();
    public static void main(String[] args) throws IOException, SQLException {
        /*
        1 Teacher many students
         */
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("enter 1 to ADD 10 RECORDS");
            System.out.println("enter 2 to SHOW ALL RECORDS");
            System.out.println("enter 3 to ADD COLUMN");
            System.out.println("enter 4 to FETCH EMPLOYEES");
            System.out.println("enter 5 to UPDATE SALARY");
            System.out.println("enter 6 to DELETE EMPLOYEES");
            System.out.println("enter 0 for exit");
            System.out.println("-------------------------------------------------");
            System.out.println("Enter choice");
            int choice = Integer.parseInt(br.readLine());

            switch(choice){
                case 1:
                    System.out.println("-- ADD 10 RECORDS");
                    operations.AddRecords();
                    break;
                case 2:
                    System.out.println("-- SHOW ALL RECORDS");
                    operations.showAllRecords();
                    break;
                case 3:
                    System.out.println("-- ADD COLUMN CITY");
                    operations.addColumn();
                    break;
                case 4:
                    System.out.println("-- FETCH EMPLOYEES");
                    operations.fetch();
                    break;
                case 5:
                    System.out.println("-- UPDATE SALARY");
                    operations.update();
                    break;
                case 6:
                    System.out.println("-- DELETE EMPLOYEES");
                    operations.delete();
                    break;
                case 0:
                    System.out.println("-- EXIT");
                    System.exit(0);
                default:
                    System.out.println("-- Enter valid choice");
            }

        }
    }
}

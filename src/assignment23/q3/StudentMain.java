package assignment23.q3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {
        public static void main(String[] args) throws IOException {
            Boolean flag = true;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StudentOperations studentOperations = new StudentOperations();
            while(flag){
                System.out.println("-------------------------------------------------");
                System.out.println("enter 1 to ALTER AND ADD COLUMN");
                System.out.println("enter 2 to FETCH RECORDS");
                System.out.println("enter 3 to FETCH BY ID");
                System.out.println("enter 4 to PERFORM OPERATIONS");
                System.out.println("enter 0 to EXIT");
                System.out.println("-------------------------------------------------");
                System.out.println("Enter choice");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice){

                    case 1:
                        studentOperations.alter();
                        break;
                    case 2:
                        studentOperations.fetchYear();
                        break;
                    case 3:
                        studentOperations.fetchId();
                        break;
                    case 4:
                        studentOperations.case4();
                        break;
                    case 0:
                        flag=false;
                        break;
                    default:
                        System.out.println("Enter valid Choice");
                }
            }
        }
    }


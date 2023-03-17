package evaluation6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Operations operations = new Operations();
    public static void main(String[] args) throws IOException, SQLException {
        /*
        1 Teacher many students
         */
        System.out.println("-- JDBC Student and Teacher --");
        System.out.println("-------------------------------------------------");
        System.out.println("enter 1 for RETRIEVE");
        System.out.println("enter 2 for UPDATE");
        System.out.println("enter 3 for DELETE");
        System.out.println("enter 4 for INSERT");
        System.out.println("enter 5 for student name 'Z'");
        System.out.println("enter 6 for teacher Exp >=5 ");
        System.out.println("enter 7 for teachercity = pune/mumbai & name ends with 'A'");
        System.out.println("enter 0 for exit");
        System.out.println("-------------------------------------------------");
        while(true) {
            System.out.println("Enter choice");
            int choice = Integer.parseInt(br.readLine());

            switch(choice){
                case 1:
                    System.out.println("-- RETRIEVE");
                    operations.retrieve();
                    break;
                case 2:
                    System.out.println("-- UPDATE");
                    operations.update();

                    break;
                case 3:
                    System.out.println("--  DELETE");
                    break;
                case 4:
                    System.out.println("-- INSERT");
                    boolean b = Operations.insert();
                    break;
                case 5:
                    System.out.println("-- student name 'Z'");
                    break;
                case 6:
                    System.out.println("-- teacher Exp >=5");
                    break;
                case 7:
                    System.out.println("-- teachercity = pune/mumbai & name ends with 'A'");
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

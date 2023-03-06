package exambooking;
import java.util.Scanner;
public class ExaminationPortal {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>   Welcome to the Examination Portal   <<<<<<<<");
        System.out.println(">>>>>>>>   Please follow the below cases to check your EXAM SCHEDULE and ELIGIBILITY   <<<<<<<<");
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Please enter your choice as: /n" +
                "***  '1' to check your Attendance  ***/n"+
                "***  '2' to check Eligibility for Exam  ***/n"+
                "***  '3' to check Exam Schedule  ***/n"+
                "***  '4' to check Regularization  ***/n"+
                "***  '0' to Exit  ***/n");
        int choice = sc.nextInt();
        boolean flag = true;
        while(flag){
            switch(choice){
                case 1:
                    System.out.println("--  View Attendance  --");
                    break;
                case 2:
                    System.out.println("--  Check Eligibility  --");
                    break;
                case 3:
                    System.out.println("--  View Exam Schedule  --");
                    break;
                case 4:
                    System.out.println("--  View Regularization  --");
                    break;
                case 0:
                    System.out.println("--  EXIT  --");
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("--  Please enter a valid choice  --");
            }
        }
    }
}

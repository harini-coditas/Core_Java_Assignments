package evaluation2;

import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    int id = sc.nextInt();
    String firstName = sc.next();
    String lastName = sc.next();
    String education = sc.next();
    String city = sc.next();
    int marks = sc.nextInt();
    public void studentGrade(){
        if(marks >= 35){
            if(marks>=35 && marks<50){
                System.out.println("Pass class");
            }
            else if(marks>=50 && marks<55){
                System.out.println("Second class");
            }
            else if(marks>=55 && marks<60){
                System.out.println("Higher second class");
            }
            else if(marks>=60 && marks<70){
                System.out.println("First class");
            }
            else if(marks>=70){
                System.out.println("Distinction");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentGrade();
    }
}

/*
Output
1
Harini
Bathini
B.tech
Pune
85
Distinction

Process finished with exit code 0
 */

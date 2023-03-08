package assignment16;
import assignment16.independentassignment16.Address;
import assignment16.dependentassignment16.Student;

public class Q1Aggregation {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "Harini";
        student.studentId = 3;
        student.setStudentAge(15);;
        Address address = new Address();
        address.city = "Pune";
    }
}
/*
import assignment16.dependentassignment16.Student;
import assignment16.independentassignment16.Address;
we need to import package and respective class if we are using aggregation in different class.
and need to use public modifiers
 */

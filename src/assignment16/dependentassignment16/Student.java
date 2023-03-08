package assignment16.dependentassignment16;
import assignment16.independentassignment16.Address;

public class Student {
    public String studentName;
    public int studentId;
    private int studentAge;
    public String studentBranch;
    Address studentAddress;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

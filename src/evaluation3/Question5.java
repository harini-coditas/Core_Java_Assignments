package evaluation3;

import java.util.*;
class Student{
    int sid;
    String sname;
    AddressTest saddress;
    Student(int sid,String sname,AddressTest saddress){
        this.sid=sid;
        this.sname=sname;
        this.saddress=saddress;
    }


    public void displayStudentDetails(){
        System.out.println("Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", saddress=" + saddress +
                '}');
    }
}
class Teacher{
    int tid;
    String tname;
    AddressTest taddress;
    Teacher(int tid,String tname,AddressTest taddress){
        this.tid=tid;
        this.tname=tname;
        this.taddress=taddress;
    }


    public void displayTeacherDetails(){
        System.out.println("Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", taddress=" + taddress +
                '}');
    }
}
public class Question5 {
    public static void main(String[] args) {
        AddressTest addressStudent = new AddressTest(3,101, 411011, "Viman Nagar","Pune","Maharastra","India");
        Student student = new Student(3, "Harini",addressStudent);
        student.displayStudentDetails();

        AddressTest addressTeacher = new AddressTest(1,118, 411011, "Viman Nagar","Pune","Maharastra","India");
        Teacher teacher = new Teacher(1, "Aarti", addressTeacher);
        teacher.displayTeacherDetails();
    }
}

/*
Output---

Student{sid=3, sname='Harini', saddress=Address{pno=3, fno=101, pincode=411011, area='Viman Nagar', city='Pune', state='Maharastra', country='India'}}
Teacher{tid=1, tname='Aarti', taddress=Address{pno=1, fno=118, pincode=411011, area='Viman Nagar', city='Pune', state='Maharastra', country='India'}}

Process finished with exit code 0
 */
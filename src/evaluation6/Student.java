package evaluation6;

public class Student {
    int sid;
    String sname;
   String scity;
    String ssubject;
    int smarks;

    public Student(int sid, String sname, String scity, String ssubject, int smarks) {
        this.sid = sid;
        this.sname = sname;
        this.scity = scity;
        this.ssubject = ssubject;
        this.smarks = smarks;
    }

    public Student(String sname, String scity, String ssubject, int smarks) {
        this.sname = sname;
        this.scity = scity;
        this.ssubject = ssubject;
        this.smarks = smarks;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scity='" + scity + '\'' +
                ", ssubject='" + ssubject + '\'' +
                ", smarks=" + smarks +
                '}';
    }
}

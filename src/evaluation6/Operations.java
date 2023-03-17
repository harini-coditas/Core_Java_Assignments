package evaluation6;

import jdbc.student_management_durgesh.ConnectionProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Operations{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //@Override
    public void retrieve() throws IOException {
        boolean f = false;
        System.out.println("ch: 1  for student, 2 for teacher --");
        int ch = Integer.parseInt(br.readLine());
        switch(ch) {

            case 1:
                try {

                    Connection connection = ConnectClass.create();
                    String q = "select * from student1;";
                    Statement statement = connection.createStatement();

                    ResultSet resultSet = statement.executeQuery(q);
                    while (resultSet.next()) {
                        int id = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        String sub = resultSet.getString(3);
                        String city = resultSet.getString(4);
                        int marks = resultSet.getInt(5);
                        int tid = resultSet.getInt(6);
                        System.out.println("Id: " + id);
                        System.out.println("Name: " + name);
                        System.out.println("sub: " + sub);
                        System.out.println("City: " + city);
                        System.out.println("marks: " + marks);
                        System.out.println("tid: " + tid);
                        System.out.println("++++++++++++++++++++++++++++++++");
                    }
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {

                    Connection connection1 = ConnectClass.create();
                    String q = "select * from student1;";
                    Statement statement1 = connection1.createStatement();

                    ResultSet resultSet = statement1.executeQuery(q);
                    while (resultSet.next()) {
                        int tid = resultSet.getInt(1);
                        String tname = resultSet.getString(2);
                        String tsub = resultSet.getString(3);
                        String tcity = resultSet.getString(4);
                        int texp = resultSet.getInt(5);
                        System.out.println("tId: " + tid);
                        System.out.println("tName: " + tname);
                        System.out.println("tsub: " + tsub);
                        System.out.println("tCity: " + tcity);
                        System.out.println("texp: " + texp);
                        System.out.println("++++++++++++++++++++++++++++++++");
                    }
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }


    }

    //@Override
    public boolean update() throws IOException, SQLException {
        boolean f = false;
        System.out.println("ch: 1  for student, 2 for teacher --");
        int ch = Integer.parseInt(br.readLine());
        switch(ch) {
            case 1:
                Connection connection = ConnectClass.create();
                String q = "update student1 where city = ? where id = ?;";
                PreparedStatement preparedStatement = connection.prepareStatement(q);
                try {
                    System.out.println("enter student city");
                    int marks = Integer.parseInt(br.readLine());
                    preparedStatement.setString(1, String.valueOf(marks));
                    System.out.println("enter student marks");
                    int id = Integer.parseInt(br.readLine());
                    preparedStatement.setInt(2, (id));
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                Connection connection1 = ConnectClass.create();
                String q1 = "update teacher1 where city = ? where id = ?;";
                PreparedStatement preparedStatement1 = connection1.prepareStatement(q1);
                try {
                    System.out.println("enter teacher city");
                    int city = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(1, String.valueOf(city));
                    System.out.println("enter student marks");
                    int id = Integer.parseInt(br.readLine());
                    preparedStatement1.setInt(2, (id));

                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }
        return f;



    }

   // @Override
    public void delete() {

    }

   // @Override
    public static boolean insert() throws SQLException, IOException {
        boolean f = false;
        System.out.println("ch: 1  for student, 2 for teacher --");
        int ch = Integer.parseInt(br.readLine());
        switch(ch) {
            case 1:
            Connection connection = ConnectClass.create();
            String q = "insert into student1(sid,sname,ssubject,scity,smarks,tid)values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            try {
                System.out.println("enter student id");
                int id = 0;
                id = Integer.parseInt(br.readLine());
                preparedStatement.setString(1, String.valueOf(id));
                System.out.println("enter student name");
                int name = Integer.parseInt(br.readLine());
                preparedStatement.setString(2, String.valueOf(name));
                System.out.println("enter student sub");
                int sub = Integer.parseInt(br.readLine());
                preparedStatement.setString(3, String.valueOf(sub));
                System.out.println("enter student city");
                int city = Integer.parseInt(br.readLine());
                preparedStatement.setString(4, String.valueOf(city));
                System.out.println("enter student marks");
                int marks = Integer.parseInt(br.readLine());
                preparedStatement.setString(5, String.valueOf(marks));
                System.out.println("enter student tid");
                int tid = Integer.parseInt(br.readLine());
                preparedStatement.setString(6, String.valueOf(tid));
                f = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;

            case 2:
                Connection connection1 = ConnectClass.create();
                String q1 = "insert into teacher1(tid,tname,tsubject,tcity,texp)values(?,?,?,?,?)";
                PreparedStatement preparedStatement1 = connection1.prepareStatement(q1);
                try {
                    System.out.println("enter teacher id");
                    int id = 0;
                    id = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(1, String.valueOf(id));
                    System.out.println("enter teacher name");
                    int name = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(2, String.valueOf(name));
                    System.out.println("enter teacher sub");
                    int sub = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(3, String.valueOf(sub));
                    System.out.println("enter teacher city");
                    int city = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(4, String.valueOf(city));
                    System.out.println("enter teacher exp");
                    int marks = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(5, String.valueOf(marks));
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    return f;

    }

   // @Override
    public void query1() {

    }

    //@Override
    public void query2() {

    }

   // @Override
    public void query3() {

    }
}

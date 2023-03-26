package assignment23.q3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class StudentOperations {
        Connection connection = Connectivity.connection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        void alter(){
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("alter table student add gender varchar(3)");
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        void fetchYear(){
            try {
                Statement statement = connection.createStatement();
                String query = "select * from student where year ='3' and percentage>70";
                ResultSet resultSet = statement.executeQuery(query);
                while(resultSet.next()){
                    System.out.println("id : "+resultSet.getInt(1)+" name : "+resultSet.getString(2)+" subject : "+resultSet.getString(3)+" city : "+resultSet.getString(4)+" marks : "+resultSet.getInt(5));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        void fetchId(){
            try {
                Statement statement = connection.createStatement();
                String query = "select * from student where id between 1 and 10";
                ResultSet resultSet = statement.executeQuery(query);
                while(resultSet.next()){
                    System.out.println("id : "+resultSet.getInt(1)+" name : "+resultSet.getString(2)+" subject : "+resultSet.getString(3)+" city : "+resultSet.getString(4)+" marks : "+resultSet.getInt(5));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        void case4() throws IOException {
            Boolean flag = true;
            StudentOperations studentOperations = new StudentOperations();
            while(flag){
                System.out.println("1: add data\n2:update data\n3:remove data\n0:Exit");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice){

                    case 1: studentOperations.add();
                        break;
                    case 2: studentOperations.update();
                        break;
                    case 3: studentOperations.remove();
                        break;
                    case 0: flag=false;
                        break;
                    default:
                        System.out.println("You  have entered wrong choice");
                }
            }
        }
        void add(){
            for(int i=1;i<=3;i++) {
                System.out.println("enter student data insert");
                try {
                    System.out.println("Enter id of student");
                    int id = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Enter name");
                    String name = bufferedReader.readLine();
                    System.out.println("enter year");
                    String year = bufferedReader.readLine();
                    System.out.println("Enter percentage");
                    int percentage = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Enter city");
                    String city = bufferedReader.readLine();
                    System.out.println("Enter gender");
                    String gender = bufferedReader.readLine();
                    PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
                    preparedStatement.setInt(1, id);
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, year);
                    preparedStatement.setInt(4, percentage);
                    preparedStatement.setString(5, city);
                    preparedStatement.setString(6, gender);
                    preparedStatement.execute();
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        void update(){
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employee SET ename = CONCAT('Mr. ', ename) WHERE GENDER = 'M';");
                preparedStatement.execute();
                PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE employee SET ename = CONCAT('Ms. ', ename) WHERE GENDER = 'F';");
                preparedStatement1.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        void remove(){
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from student where year=4");
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


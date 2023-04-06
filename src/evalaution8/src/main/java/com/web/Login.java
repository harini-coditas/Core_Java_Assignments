package com.web;

import com.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private String jdbcURL = "jdbc:mysql://localhost:3306/javajdbc?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "81189149@hH";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

//        public boolean loginUser(User user) throws SQLException {
//            boolean login;
            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement("select email,country from users");) {
                ResultSet rs = statement.executeQuery();
               // String name="";
                String email = req.getParameter("email");
                String country = req.getParameter("country");
               // String id = req.getParameter("id");
                HttpSession session = req.getSession();
                int count=0;




//            rs = ps.executeQuery();
//            String name="";
//
                while (rs.next()){
                    if(email.equals(rs.getString(1)) && country.equals(rs.getString(2))){
                      //  id = rs.getString(3);
                        count++;
                        break;
                    }
                }

            if(count==1){
                session.setAttribute("email",email);
                session.setAttribute("country",country);
                resp.sendRedirect("UserServlet");
            }
            else {
                out.println("<h2 style='color:red'>Invalid Credentials!</h2><br>");
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                rd.include(req,resp);
            }

//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//                System.out.println("Login USer:"+statement);
//                statement.setString(1, user.getEmail());
//                statement.setString(2, user.getCountry());
//                statement.setInt(3, user.getId());
//
//                login = statement.executeUpdate() > 0;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
       // return login;


//        try {
//            ps = con.prepareStatement("select email,password,firstname from register");
//            rs = ps.executeQuery();
//            String name="";
//
//            while (rs.next()){
//                if(email.equals(rs.getString(1)) && pwd.equals(rs.getString(2))){
//                    name = rs.getString(3);
//                    count++;
//                    break;
//                }
//            }
//
//            if(count==1){
//                session.setAttribute("name",name);
//                session.setAttribute("email",email);
//                resp.sendRedirect("WelcomeServlet");
//            }
//            else {
//                out.println("<h2 style='color:red'>Invalid Credentials!</h2><br>");
//                RequestDispatcher rd = req.getRequestDispatcher("login.html");
//                rd.include(req,resp);
//            }
//
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }
}

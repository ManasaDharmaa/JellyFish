package com.xworkz.busStopJDBC.runner;
import java.sql.*;

public class Kempegowda {

    public static void main(String[] args) {


        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection succefully");

            String url = "jdbc:mysql://localhost:3306/waterbottel";
            String user = "root";
            String password = "root";

             connection = DriverManager.getConnection(url,user, password);
            System.out.println("Driver Manager connection is successfully");

            String insert = "insert into bottel values(1, 'Milton', 500, 1300.00)";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("No of Row : " + row);


        }catch (ClassNotFoundException | SQLException e){
            System.out.println("exception : "+e.getMessage());
        } finally {
            try{
                connection.close();
            }catch (SQLException e){
                System.out.println("connection close exception : "+e.getMessage());
            }
        }



    }
}

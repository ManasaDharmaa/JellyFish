package com.xworkz.busStopJDBC.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HassanKSRTC {

    public static void main(String[] args) {


        Connection connection = null;
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/waterbottel";
            String userName = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, userName, password);

            String insert = "insert into bottel values(0, 'Pexpo', 1, 1599.0)";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("No of Rows : " + row);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("exception : " + e.getMessage());
        } finally {

            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("exception : " + e.getMessage());
            }
        }
    }
}

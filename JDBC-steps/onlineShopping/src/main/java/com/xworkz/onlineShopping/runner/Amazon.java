package com.xworkz.onlineShopping.runner;

import java.sql.*;

public class Amazon {


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("file found");

            String url = "jdbc:mysql://localhost:3306/onlineShopping";
            String userName = "root";
            String password = "root";
            DriverManager.getConnection(url, userName, password);

            System.out.println("connection successfully");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

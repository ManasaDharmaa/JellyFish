package com.xworkz.jdbcSevenSteps.runner;
//import the package
import java.sql.*;

public class SuperMarketJdbc {

    public static void main(String[] args) {
        System.out.println("this is main method");

        try {

            //load the drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection succefully");

           //  Establish the connection
            String url = "jdbc:mysql://localhost:3306/application";
            String userName = "root";
            String password = "root";
            DriverManager.getConnection(url, userName, password);
            System.out.println("Drive Manager Connection is succesfully");

        } catch (ClassNotFoundException | SQLException exception){
            System.err.println("class not found exception "+exception.getMessage());
        }

         //create statment
        //excecute the statment
        //process the result
        //close the connection


    }
}

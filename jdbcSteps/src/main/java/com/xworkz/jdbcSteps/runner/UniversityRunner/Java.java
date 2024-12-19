package com.xworkz.jdbcSteps.runner.UniversityRunner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Java {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver found");

            String url ="jdbc:mysql://localhost:3306/";
            String userName ="root";
            String password ="root";

            DriverManager.getConnection(url, userName, password);

            System.out.println("connection Successfully");
        } catch (ClassNotFoundException | SQLException exception){
            System.out.println("Driver" +
                    " not found : "+exception.getMessage());
        }

    }
}

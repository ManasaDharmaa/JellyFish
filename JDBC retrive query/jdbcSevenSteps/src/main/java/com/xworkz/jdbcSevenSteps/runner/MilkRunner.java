package com.xworkz.jdbcSevenSteps.runner;

import com.xworkz.jdbcSevenSteps.dto.MilkDto;

import java.sql.*;

public class MilkRunner {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/waterbottel", "root", "root");
            statement = connection.createStatement();
            String query = "Select * from bottel";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("id : " + resultSet.getInt(1)+
                        " brand  : " + resultSet.getString(2) +
                        " quantity : " + resultSet.getInt(3) +
                        " cost : "+ resultSet.getDouble(4));

            }

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(connection != null){
                    connection.close();
                }else  if(statement != null){
                    connection.close();
                }
            } catch (SQLException e){
                e.getMessage();
            }
        }

    }
}

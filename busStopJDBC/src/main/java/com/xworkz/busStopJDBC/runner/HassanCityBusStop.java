package com.xworkz.busStopJDBC.runner;
import  java.sql.*;

public class HassanCityBusStop {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/waterbottel";
            String userName = "root";
            String password = "root";
           connection = DriverManager.getConnection(url, userName, password);

            String insert = "insert into bottel values (0, 'Borosil', 650, 975)";
            String insert1 = "insert into bottel values (0, 'Milton', 850, 975)";
            String insert2 = "insert into bottel values (0, 'Borosil', 950, 975)";
            String insert3= "insert into bottel values (0, 'Pexpo', 350, 500)";
            String insert4 = "insert into bottel values (0, 'Borosil', 750, 975)";
            String insert5 = "insert into bottel values (0, 'Milton', 500, 450)";

            Statement statement = connection.createStatement();
            statement.addBatch(insert);
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            int[] row = statement.executeBatch();
            System.out.println("no of rows " + row.length);

        }catch (ClassNotFoundException | SQLException e){
            System.out.println("exception : " + e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException e){
                System.out.println("exception : " + e.getMessage());
            }
        }

    }
}

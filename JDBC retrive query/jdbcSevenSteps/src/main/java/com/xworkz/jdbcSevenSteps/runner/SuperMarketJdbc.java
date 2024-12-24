package com.xworkz.jdbcSevenSteps.runner;
//import the package
import java.sql.*;

public class SuperMarketJdbc {

    public static void main(String[] args) {
        System.out.println("this is main method");


        Connection connection = null;
        try {

            //load the drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection succefully");

           //  Establish the connection
            String url = "jdbc:mysql://localhost:3306/application";
            String userName = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Drive Manager Connection is succesfully");

            //create statment
            //excecute the statment
            //process the result
             String insert = "insert into whatsapp(ceo,companyName) values('kung', 'whatsApp')";
            String insert1 = "insert into whatsapp(ceo,companyName) values('vang', 'whatsApp')";
            String insert2 = "insert into whatsapp(ceo,companyName) values('mang', 'whatsApp')";



             Statement statement = connection.createStatement();
             statement.addBatch(insert);
            statement.addBatch(insert1);
            statement.addBatch(insert2);

//             int row = statement.executeUpdate(insert);
             int [] row = statement.executeBatch();
             System.out.println("no of rows : " + row.length);
             

        } catch (ClassNotFoundException | SQLException exception){
            System.err.println("class not found exception "+exception.getMessage());
        } finally {

            //close the connection
            
            try{
                connection.close();
            }catch (SQLException sqlException){
                System.out.println(sqlException.getMessage());
            }
        }

            
            
            
        



        
    
        


    }
}

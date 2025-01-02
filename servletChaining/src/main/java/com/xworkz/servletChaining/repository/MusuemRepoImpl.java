package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Musuemdto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusuemRepoImpl implements MusuemRepo{


    @SneakyThrows
    @Override
    public void save(Musuemdto musuemdto) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
            Statement statement = connection.createStatement(); ){

            String insert = "insert into Musuem values(0, '"+musuemdto.getName()+"','"+musuemdto.getAorC()+"','"+musuemdto.getNumber()+"','"+musuemdto.getEmail()+"','"+musuemdto.getCost()+"')";
            int row = statement.executeUpdate(insert);
            System.out.println(row);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<Musuemdto> getAll() {

        Class.forName("com.mysql.cj.jdbc.Driver");
        List<Musuemdto> musuemdtoList = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
            Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery("select * from musuem")){


            while (resultSet.next()){
              int  id = resultSet.getInt(1);
              String name = resultSet.getString(2);
              String adultChild = resultSet.getString(3);
              long number = resultSet.getLong(4);
              String email = resultSet.getString(5);
              double cost = resultSet.getDouble(6);

                Musuemdto musuemdto = new Musuemdto(id, name, adultChild, number, email, cost);

                musuemdtoList.add(musuemdto);
            }




        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return musuemdtoList;
    }
}

package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Milkdto;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MilkRepoImpl implements MilkRepo {
    @SneakyThrows
    @Override
    public boolean save(Milkdto milkdto) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
             Statement statement = connection.createStatement();) {


            String insert = "insert into milk values(0, '" + milkdto.getBrand() + "','" + milkdto.getType() + "','" + milkdto.getQuantity() + "','" + milkdto.getPrice() + "')";
            int row = statement.executeUpdate(insert);

            System.out.println(row);
        } catch (  SQLException e) {
            System.out.println(e.getMessage());

        }
        return true;
    }

    @SneakyThrows
    @Override
    public List<Milkdto> getAll() {

        Class.forName("com.mysql.cj.jdbc.Driver");

        List<Milkdto> milkList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
             Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery("select * from milk")) {

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String type = resultSet.getString(3);
                int quantity = resultSet.getInt(4);
                double cost = resultSet.getDouble(5);


                Milkdto milkdto = new Milkdto(id,name, type, quantity,cost);
                   milkList.add(milkdto);


            }



        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return milkList;
    }

}

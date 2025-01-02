package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Sweetdto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SweetRepoImpl implements SweetRepo{

    private  List<Sweetdto> sweetList = new ArrayList<>();
    @SneakyThrows
    @Override
    public void save(Sweetdto sweetdto) {
        System.out.println(sweetdto);

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
            Statement statement = connection.createStatement() ){

            String insert ="insert into sweet values(0,'"+sweetdto.getShopName()+"','"+sweetdto.getSweetName()+"','"+sweetdto.getQuantity()+"','"+sweetdto.getCost()+"')";
            int insetRow = statement.executeUpdate(insert);
            System.out.println(insetRow);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<Sweetdto> getAll() {
        System.out.println("running get all repo impl");

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
            Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery("select * from sweet")){

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String shopName = resultSet.getString(2);
                String sweetName = resultSet.getString(3);
                int quantity = resultSet.getInt(4);
                double cost = resultSet.getDouble(5);

                Sweetdto sweetdto = new Sweetdto(id, shopName, sweetName, quantity, cost);
                 sweetList.add(sweetdto);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return sweetList;
    }
}

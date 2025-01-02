package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Cricketdto;
import com.xworkz.servletChaining.dto.Milkdto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketRepoImpl implements CricketRepo{


    @SneakyThrows
    @Override
    public boolean save(Cricketdto cricketdto) {
        System.out.println("this is repo save");

        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
            Statement statement = connection.createStatement()){

            String insert = "insert into cricket values(0,'"+cricketdto.getTeamName()+"','"+cricketdto.getCaptain()+"','"+cricketdto.getCountry()+"','"+cricketdto.getOwner()+"','"+cricketdto.getAmbassador()+"','"+cricketdto.getBudget()+"','"+cricketdto.getPlayers()+"','"+cricketdto.getExtra_players()+"')";

            int row = statement.executeUpdate(insert);
            System.out.println(row);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return true;
    }

    @SneakyThrows
    @Override
    public List<Cricketdto> getAll() {

        List<Cricketdto> cricketdtoList = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
            Statement statement = connection.createStatement(); ResultSet resultSet =statement.executeQuery("select * from cricket")){

            while (resultSet.next()){
              int id = resultSet.getInt(1);
              String name = resultSet.getString(2);
              String captain = resultSet.getString(3);
              String country = resultSet.getString(4);
              String owner = resultSet.getString(5);
              String ambassador = resultSet.getString(6);
              double budget = resultSet.getDouble(7);
              int players = resultSet.getInt(8);
              int extraPlayers = resultSet.getInt(9);

              Cricketdto cricketdto = new Cricketdto(id, name, captain, country, owner, ambassador, budget, players, extraPlayers);
              cricketdtoList.add(cricketdto);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return cricketdtoList;
    }
}

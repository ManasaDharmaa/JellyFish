package com.xworkz.jdbcAutoCommitInsertUpdate.dao;

import java.sql.ResultSet;

public interface ShoppingDao {


        int save(int id,String shop_name,String shopKeeper_name,String shop_location,String purchased_item,int item_cost);
        ResultSet getDataById(int id);
        int UpdatebyField(int id,String shop_name,String shopKeeper_name,String shop_location,String purchased_item,int item_cost);
}

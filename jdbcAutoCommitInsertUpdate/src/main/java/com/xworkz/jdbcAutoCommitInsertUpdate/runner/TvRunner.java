package com.xworkz.jdbcAutoCommitInsertUpdate.runner;


import com.xworkz.jdbcAutoCommitInsertUpdate.dao.TvDao;
import com.xworkz.jdbcAutoCommitInsertUpdate.dao.TvDaoImpl;

public class TvRunner {
        private  static TvDao tvDao=new TvDaoImpl();
        public static void main(String[] args) {
//        tvDao.save(0,"amruthadare","Zee",4.3,5,"kannada");
            tvDao.getDataById(3);
            int updated=tvDao.UpdateDataByFields(2,"lakshmi  nivasa","Zee",6.0,5,"kannada");
            System.out.println("updated :"+updated);
        }
    }


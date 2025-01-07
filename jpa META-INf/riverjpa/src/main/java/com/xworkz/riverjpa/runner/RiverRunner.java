package com.xworkz.riverjpa.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RiverRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  =Persistence.createEntityManagerFactory("sita");
    }
}

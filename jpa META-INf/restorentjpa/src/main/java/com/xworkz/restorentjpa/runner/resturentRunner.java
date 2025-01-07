package com.xworkz.restorentjpa.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class resturentRunner {

    public static void main(String[] args) {

    EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("Ganesha");
    }
}

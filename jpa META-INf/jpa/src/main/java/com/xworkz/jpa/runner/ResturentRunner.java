package com.xworkz.jpa.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ResturentRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("resturent");
    }
}

package com.xworkz.templejpa.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TempleRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Radha");
    }
}

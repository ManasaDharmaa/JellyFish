package com.xworkz.riverjpa.runner;


import com.xworkz.riverjpa.entity.PGEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PGRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<PGEntity> list = new ArrayList<>();

        list.add(new PGEntity(null, "Kalika", "Shankar", 6000.0));
        list.add(new PGEntity(null,"Kanika", "Sureka", 5500.0));
        list.add(new PGEntity(null, "Kushi", "shanthi", 4000.0));
        list.add(new PGEntity(null,"Satya", "Sumitra", 5000.0));
        list.add(new PGEntity(null, "Sai Ram", "satish", 7000.0));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

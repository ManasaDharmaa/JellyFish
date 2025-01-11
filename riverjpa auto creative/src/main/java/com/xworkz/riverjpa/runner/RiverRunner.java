package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.RiverEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RiverRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  =Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<RiverEntity> list = new ArrayList<>();

        list.add(new RiverEntity(null, "Ganga", 5608.9, "Ganga"));
        list.add(new RiverEntity(null,"Yammuna", 78654.9, "Yammuna"));
        list.add(new RiverEntity(null, "Godavari", 5608.9, "Godavari"));
        list.add(new RiverEntity(null,"Kaveri", 98654.9, "Kaveri"));
        list.add(new RiverEntity(null, "Narmada", 345408.9, "Narmada"));



        entityManager.getTransaction().begin();
       list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

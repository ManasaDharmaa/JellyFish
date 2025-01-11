package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.MallEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MallRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  =Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<MallEntity> list = new ArrayList<>();

        list.add(new MallEntity(null, "GT", "GT Retail & Hospitality Pvt. Ltd", 76588));
        list.add(new MallEntity(null,"Orion", "The Brigade Group", 65478));
        list.add(new MallEntity(null, "lulu", "Yusuff Ali", 43567));
        list.add(new MallEntity(null,"forum", "Prestige Group", 45890));
        list.add(new MallEntity(null, "D mart", "Damani", 98765));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.ShopingAppEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ShopingAppRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<ShopingAppEntity> list = new ArrayList<>();

        list.add(new ShopingAppEntity(null, "Flipkart", "Walmart", "Flipkart"));
        list.add(new ShopingAppEntity(null,"Amazon", "Jeff Bezos", "Amazon"));
        list.add(new ShopingAppEntity(null, "Myntra", "Mukesh Bansa", "myntra"));
        list.add(new ShopingAppEntity(null,"Meesho", "Vidit Aatrey", "meesho"));
        list.add(new ShopingAppEntity(null, "Nike", "Phil Knight", " Elliott Hil"));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

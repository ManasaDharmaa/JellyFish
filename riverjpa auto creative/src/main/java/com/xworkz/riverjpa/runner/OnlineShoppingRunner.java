package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.OnlineShopingEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  =Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<OnlineShopingEntity> list = new ArrayList<>();

        list.add(new OnlineShopingEntity(null, "Flipkart", "Walmart", "Flipkart"));
        list.add(new OnlineShopingEntity(null,"Amazon", "Jeff Bezos", "Amazon"));
        list.add(new OnlineShopingEntity(null, "Myntra", "Mukesh Bansa", "myntra"));
        list.add(new OnlineShopingEntity(null,"Meesho", "Vidit Aatrey", "meesho"));
        list.add(new OnlineShopingEntity(null, "Nike", "Phil Knight", " Elliott Hil"));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.CountryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CountryRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<CountryEntity> list = new ArrayList<>();

        list.add(new CountryEntity(null, "India", "New delhi", 28));
        list.add(new CountryEntity(null,"China", "Beijing", 24));
        list.add(new CountryEntity(null, "Pakistan", "Islamabad", 12));
        list.add(new CountryEntity(null,"Bangladesh", "Dhaka", 15));
        list.add(new CountryEntity(null, "Germany", "Berlin", 40));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.TreeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TreeRunner {


    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<TreeEntity> list = new ArrayList<>();

        list.add(new TreeEntity(null, "Oak", "Karnataka", 180));
        list.add(new TreeEntity(null,"Antarctic beech", "Maharashtra", 250));
        list.add(new TreeEntity(null, "Apple", "Jammu", 500));
        list.add(new TreeEntity(null,"Neem", "Kerala", 1000));
        list.add(new TreeEntity(null, "Banyan", "Nepal", 50));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

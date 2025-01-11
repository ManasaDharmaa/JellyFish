package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.CollageEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CollageRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<CollageEntity> list = new ArrayList<>();

        list.add(new CollageEntity(null, "MCE", 10, "Pradeep","Autonomous"));
        list.add(new CollageEntity(null, "RC", 9, "Sudeep","VTU"));
        list.add(new CollageEntity(null, "HKS", 7, "Satish","Private"));
        list.add(new CollageEntity(null, "PRS", 5, "Ramesh","Govt"));
        list.add(new CollageEntity(null, "HRS", 8, "Arvind","Autonomous"));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

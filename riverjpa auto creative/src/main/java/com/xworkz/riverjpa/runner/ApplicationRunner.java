package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.ApplicationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<ApplicationEntity> list = new ArrayList<>();

        list.add(new ApplicationEntity(null, "Instagram", "Adam Mosseri", "Meta"));
        list.add(new ApplicationEntity(null,"Whatsapp", "Jan Koum", "Meta"));
        list.add(new ApplicationEntity(null, "FaceBook", "Mark Zuckerberg", "Meta"));
        list.add(new ApplicationEntity(null,"netflix", "Greg Peters", "netflix"));
        list.add(new ApplicationEntity(null, "Amazon Prime", "Andy Jassy", "Amazon"));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

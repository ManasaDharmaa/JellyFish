package com.xworkz.riverjpa.runner;

import com.xworkz.riverjpa.entity.OnlineShopingEntity;
import com.xworkz.riverjpa.entity.TempleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TempleRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("sita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        List<TempleEntity> list = new ArrayList<>();

        list.add(new TempleEntity(null, "Ram Mandir", "East", "UP"));
        list.add(new TempleEntity(null,"ragavendra mata", "North", "Maharashtra"));
        list.add(new TempleEntity(null, "Chamundi beta", "North", "Karnataka"));
        list.add(new TempleEntity(null,"Durga temple", "East", "Kalkata"));
        list.add(new TempleEntity(null, "Ganesha temple", "East", "Karnataka"));



        entityManager.getTransaction().begin();
        list.forEach(e->entityManager.persist(e));
        entityManager.getTransaction().commit();


    }
}

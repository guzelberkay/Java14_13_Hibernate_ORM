package com.berkayg.pu_Hibernate;

import com.berkayg.pu_Hibernate.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_hibernate");

        EntityManager entityManager = entityManagerFactory.createEntityManager();


        User user1 = new User("Bengu", "Yilmaz", "bengua@gmail.com", "555-444-22-11", "benguyilmaz", "1234");


        entityManager.getTransaction().begin();



        User user = entityManager.find(User.class,1); // id ye göre

        user.setName("Doruk");

        entityManager.persist(user); //saklamak


        entityManager.getTransaction().commit(); // bu aşamada vt kaydetme gerçekleşir

        entityManager.close();
        entityManagerFactory.close();

    }
}
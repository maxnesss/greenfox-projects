package com.example.test;

import com.example.test.entities.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) {
        Todo todo1 = new Todo("buy cat");
        entityManager.persist(todo1);
        entityManager.persist(new Todo("watch watch"));
    }
}

package com.example.testmysql;

import com.example.testmysql.models.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMysqlApplication.class, args);
    }

    @PersistenceContext
    private EntityManager entityManager;


}

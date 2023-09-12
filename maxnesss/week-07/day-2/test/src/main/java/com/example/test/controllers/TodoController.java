package com.example.test.controllers;

import com.example.test.entities.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = {"/","/list"})
    @Transactional
    public List<Todo> list(){
        Query query = entityManager.createNativeQuery("SELECT * FROM todo", Todo.class);
        List<Todo> todos = query.getResultList();

        return todos;
    }
    @PostMapping("/post/")
    @Transactional
    public void post(@RequestParam String title){
        entityManager.persist(new Todo(title));
    }
}

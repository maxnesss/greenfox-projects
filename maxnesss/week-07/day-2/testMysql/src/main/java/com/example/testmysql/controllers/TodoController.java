package com.example.testmysql.controllers;

import com.example.testmysql.models.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = {"/","/list"})
    @Transactional
    public List<Todo> list(){
        Query query = entityManager.createNativeQuery("SELECT * FROM todo where done = false", Todo.class);
        List<Todo> todos = query.getResultList();

        return todos;
    }
    @RequestMapping ("/{id}")
    @Transactional
    public String delete(@PathVariable long id) {

        entityManager.createNativeQuery("delete FROM todo where id=?").setParameter(1,id).executeUpdate();
        list();
        return "ok";
    }
//    @PostMapping("/todo")
//    public List<Todo> addToDo(@RequestParam String title, @RequestParam Boolean urgent, @RequestParam Boolean done){
//
//
//
//        Query query = entityManager.createNativeQuery("SELECT * FROM todo where done = false", Todo.class);
//        List<Todo> todos = query.getResultList();
//        return todos
//    }


}

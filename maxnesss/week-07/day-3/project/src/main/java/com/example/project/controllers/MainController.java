package com.example.project.controllers;

import com.example.project.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PersistenceContext
    private EntityManager entityManager;
    @GetMapping("/doubling")
    @ResponseBody
    @Transactional
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {

        if (input != null) {

            entityManager.persist(new Log("/doubeling","input="+input));

            return ResponseEntity.status(HttpStatus.OK).body(new Doubles(input, input * 2));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("Please provide an input!"));
        }
    }
    @GetMapping("/log")
    @ResponseBody
    public ResponseEntity<?> log(){

        Logs logs = new Logs();
        Query query = entityManager.createNativeQuery("select * from log", Log.class);

        logs.setEntries(query.getResultList());

        return ResponseEntity.status(HttpStatus.OK).body(logs);
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<?> greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name != null & title != null) {
            return ResponseEntity.status(HttpStatus.OK).body(new Greeting("Oh, hi there " + name + ", my dear " + title + "!"));
        }
        if (name != null & title == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("Please provide a title!"));
        }
        if (name == null & title != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("Please provide a name!"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors("Please provide a name and a title!"));
    }
    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public ResponseEntity<?> apandA(@PathVariable String appendable){
        return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable + "a"));
    }
    @PostMapping("/dountil/{operation}")
    @ResponseBody
    public ResponseEntity<?> sum(@PathVariable String operation, @RequestBody Until until) {
        if (operation.equals("sum")) {
            int sum = 0;
            for (int i = 0; i <= until.getUntil(); i++) {
                sum += i;
            }
            return ResponseEntity.status(HttpStatus.OK).body(new Result(sum));
        }
        if(operation.equals("factor")){
            int fact = 1;
            for (int i = 1; i <= until.getUntil() ; i++) {
                fact *= i;
            }
            return ResponseEntity.status(HttpStatus.OK).body(new Result(fact));
        }
        return ResponseEntity.status(HttpStatus.OK).body(new Result(999999));
    }
    @PostMapping("/arrays/")
    @ResponseBody
    public ResponseEntity<?> array(@RequestBody InputArr inputArr) {
        if (inputArr.getWhat().equals("sum")) {
            int sum = Arrays.stream(inputArr.getNumbers()).sum();


            return ResponseEntity.status(HttpStatus.OK).body(new OutputNo(sum));
        }
        if (inputArr.getWhat().equals("multiply")){
            int mSum = Arrays.stream(inputArr.getNumbers()).reduce(1, (a, b) -> a * b);
            return ResponseEntity.status(HttpStatus.OK).body(new OutputNo(mSum));
        }
        if (inputArr.getWhat().equals("double")){
            int[] numbsI = inputArr.getNumbers();
            int[] numbsL = new int[numbsI.length];
            for (int i = 0; i < numbsI.length; i++) {
                numbsL[i] = numbsI[i] *2;
            }
            return ResponseEntity.status(HttpStatus.OK).body(new OutputL(numbsL));

        }
        return ResponseEntity.status(HttpStatus.OK).body(new OutputNo(888888));

    }
}



package com.example.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

public class Logs {
    private EntityManager entityManager;
    private List<Log> entries;



    public Logs() {
    }


    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEntryCount() {
        return entries.size();
    }
}

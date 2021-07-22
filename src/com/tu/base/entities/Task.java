package com.tu.base.entities;

import java.time.LocalDateTime;

public class Task {

    private Integer id;

    private String tittle;

    private String description;

    private String importance;

    private User author;

    private LocalDateTime dueDate;

    public Task() {
    }

    public Task(Integer id, String tittle, String description, String importance, User author) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.importance = importance;
        this.author = author;
    }

    public Task(Integer id, String tittle, String description, String importance, User author, LocalDateTime dueDate) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.importance = importance;
        this.author = author;
        this.dueDate = dueDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
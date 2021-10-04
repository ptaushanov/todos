package com.tu.base.entities;

import java.util.Date;

public class Task {

    private Integer id;
    private String title;
    private String description;
    private String importance;
    private Integer userId;
    private Date dueDate;

    public Task() {
    }

    public Task(Integer id, String title, String description, String importance, Integer userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.importance = importance;
        this.userId = userId;
    }

    public Task(Integer id, String title, String description, String importance, Integer userId, Date dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.importance = importance;
        this.userId = userId;
        this.dueDate = dueDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "<html><br/>Task: " + title + "<br/>Importance: " + importance;
    }
}
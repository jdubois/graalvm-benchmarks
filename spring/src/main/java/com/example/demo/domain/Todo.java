package com.example.demo.domain;

import java.util.Date;

public class Todo {

    public Todo() {
    }

    public Todo(Long id, String description, String details, Date creationDate, int priority, User assignedTo, boolean done) {
        this.id = id;
        this.description = description;
        this.details = details;
        this.creationDate = creationDate;
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.done = done;
    }

    private Long id;

    private String description;

    private String details;

    private Date creationDate;

    private int priority;

    private User assignedTo;

    private boolean done;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

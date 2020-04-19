package com.example.demo.domain;

import java.util.Date;

public class User {

    private String login;

    private String lastName;

    private String firstName;

    private String email;

    private Date creationDate;

    public User(String login, String lastName, String firstName, String email, Date creationDate) {
        this.login = login;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.creationDate = creationDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

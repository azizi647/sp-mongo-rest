package com.azizli.spbt.spbtytut.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
@Document
public class User {

    @Id // primary key
    private String id;
    private String firstname;
    private String lastname;
    private HashMap parameters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public HashMap getParameters() {
        return parameters;
    }

    public void setParameters(HashMap parameters) {
        this.parameters = parameters;
    }
}

package com.github.slawku10.consumingrest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class User {
    private int id;
    private String name;
    private String lastName;
    private String country;


    public User(int id, String name, String lastName, String country) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.country = country;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

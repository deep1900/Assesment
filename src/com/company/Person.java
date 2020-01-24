package com.company;

import java.util.UUID;

public class Person
{
    public final  String id = UUID.randomUUID().toString();
    private String name;

    public Person(){


    }

    public Person(String name) {
        //this.id = UUID.randomUUID().toString();

        this.name = name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

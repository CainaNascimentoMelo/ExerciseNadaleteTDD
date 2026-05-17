package com.example.person;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<Email> emails;

    public Person(String name, int age, List<Email> emails) {
        this.name = name;
        this.age = age;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Email> getEmails() {
        return emails;
    }
}
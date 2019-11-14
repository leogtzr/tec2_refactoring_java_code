package com.refactoring.encapsulate_variable.domain;

public class Person {

    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

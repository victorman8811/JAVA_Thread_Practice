package com.systex.quiz.ch01.util;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Person temp) {
        return temp.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {

        return name.hashCode();

    }

    // Todo Case
}
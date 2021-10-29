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

    public boolean equals(Object temp) {
        Person person = (Person) temp;
        return getName() == person.getName();
    }

    @Override
    public int hashCode() {

        return name.hashCode();

    }

    @Override
    public String toString(){

        return  this.name;

    }

    // Todo Case
}
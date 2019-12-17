package com.company.Test2;

public class Person {
    private String lastName;
    private String name;
    private String midlleName;

    public Person(String lastName, String name, String midlleName) {
        this.lastName = lastName;
        this.name = name;
        this.midlleName = midlleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidlleName() {
        return midlleName;
    }

    public void setMidlleName(String midlleName) {
        this.midlleName = midlleName;
    }

    @Override
    public String toString() {
        return lastName + " "
                 + name + " "
                 + midlleName + " ";
    }
}
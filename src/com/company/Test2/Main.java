package com.company.Test2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Baetov","Bektai", "Nurbekovich");
        Person p2 = new Person("Samuel","L","Jackson");
        Person p3 = new Person("Baetov","Bektai","Nurbekovich");
        LinkedList<Person> linkedList = new LinkedList<Person>();
        linkedList.add(p1);
        linkedList.add(p2);
linkedList.add(p3);
        System.out.println(linkedList);
    }
}

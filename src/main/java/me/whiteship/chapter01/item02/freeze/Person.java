package me.whiteship.chapter01.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;

    private final int birthYear;

    private final List<String> kids;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.kids = new ArrayList<>();
    }

    public static void main(String[] args) {
        Person person = new Person("keesun", 1982);

    }
}

package me.whiteship.chapter02.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// Comparable 구현 시의 이점 (87쪽)
public class WordList {
    public static void main(String[] args) {
        String[] values = new String[]{"keesun", "whiteship", "java"};

        Set<String> s = new TreeSet<>();
        Collections.addAll(s, values);
        System.out.println(s);
    }
}

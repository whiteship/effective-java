package me.whiteship.chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(20);
        numbers.add(44);
        numbers.add(3);

        System.out.println(numbers);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        numbers.sort(desc.reversed());

        System.out.println(numbers);
    }
}

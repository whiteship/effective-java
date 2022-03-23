package me.whiteship.chapter02.item11.hashtable;

import me.whiteship.chapter02.item11.guava.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();

        PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
        PhoneNumber number2 = new PhoneNumber(456, 789, 1111);

//         TODO 같은 인스턴스인데 다른 hashCode
//         다른 인스턴스인데 같은 hashCode를 쓴다면?
        System.out.println(number1.equals(number2));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());

        map.put(number1, "keesun");
        map.put(number2, "whiteship");

        String s = map.get(number2);
        System.out.println(s);
    }
}

package me.whiteship.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "keesun,whiteship";
            name.split(",");
//            SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}

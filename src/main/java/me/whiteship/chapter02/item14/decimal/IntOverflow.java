package me.whiteship.chapter02.item14.decimal;

public class IntOverflow {

    public static void main(String[] args) {
        System.out.println(-2147483648 - 10);
        System.out.println(Integer.compare(-2147483648, 10));
    }
}

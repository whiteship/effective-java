package me.whiteship.chapter02.item10.inheritance;

import me.whiteship.chapter02.item10.Color;

public class SmellPointTest {

    /**
     * TODO -Xss10M
     * @param args
     */
    public static void main(String[] args) {
        SmellPoint p1 = new SmellPoint(1, 0, "sweat");
        ColorPoint p2 = new ColorPoint(1, 0, Color.RED);
        p1.equals(p2);
    }
}

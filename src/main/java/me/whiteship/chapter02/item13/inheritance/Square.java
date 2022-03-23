package me.whiteship.chapter02.item13.inheritance;

public class Square extends Shape {

    private int length, height;

    public Square(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Square square = new Square(10, 2);
        Square copy = (Square) square.clone();
        System.out.println(copy.getArea());
    }

    @Override
    public int getArea() {
        return this.length * this.height;
    }
}

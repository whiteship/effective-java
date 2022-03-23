package me.whiteship.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {

    }

    class InnerClass {

        public void hello() {
            OuterClass.this.hi();
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(innerClass);

        outerClass.printFiled();
    }

    private void printFiled() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println("field type:" + field.getType());
            System.out.println("field name:" + field.getName());
        }
    }
}

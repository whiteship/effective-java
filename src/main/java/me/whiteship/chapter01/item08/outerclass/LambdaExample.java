package me.whiteship.chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {

    private int value = 10;

    private Runnable instanceLambda = () -> {
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] declaredFields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type: " + field.getType());
            System.out.println("field name: " + field.getName());
        }
    }

}

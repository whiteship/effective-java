package me.whiteship.chapter01.item04;

import org.springframework.context.annotation.AnnotationConfigUtils;

public class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
//    private UtilityClass() {
//        throw new AssertionError();
//    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        UtilityClass utilityClass = new UtilityClass();
        utilityClass.hello();


    }
}

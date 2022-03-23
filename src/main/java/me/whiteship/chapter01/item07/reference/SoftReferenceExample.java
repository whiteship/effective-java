package me.whiteship.chapter01.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // TODO 거의 안 없어집니다.
        //  왜냐면 메모리가 충분해서.. 굳이 제거할 필요가 없으니까요.
        System.out.println(soft.get());
    }
}

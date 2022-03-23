package me.whiteship.chapter01.item07.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // TODO 거의 없어집니다.
        //  왜냐면 약하니까(?)...
        System.out.println(weak.get());
    }
}

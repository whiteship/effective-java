package me.whiteship.chapter01.item08.finalizer;

import com.sun.management.UnixOperatingSystemMXBean;
import org.springframework.jmx.support.MBeanServerFactoryBean;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

public class App {

    /**
     * 코드 참고 https://www.baeldung.com/java-finalize
     */
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        int i = 0;
        while(true) {
            i++;
            new FinalizerIsBad();

            if ((i % 1_000_000) == 0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queueStaticField = finalizerClass.getDeclaredField("queue");
                queueStaticField.setAccessible(true);
                ReferenceQueue<Object> referenceQueue = (ReferenceQueue) queueStaticField.get(null);

                Field queueLengthField = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLengthField.setAccessible(true);
                long queueLength = (long) queueLengthField.get(referenceQueue);
                System.out.format("There are %d references in the queue%n", queueLength);
            }
        }
    }
}

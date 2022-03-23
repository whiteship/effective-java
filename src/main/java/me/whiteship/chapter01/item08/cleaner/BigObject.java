package me.whiteship.chapter01.item08.cleaner;

import java.util.List;

public class BigObject {

    private List<Object> resource;

    public BigObject(List<Object> resource) {
        this.resource = resource;
    }

    public static class ResourceCleaner implements Runnable {

        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("cleaned up.");
        }
    }
}

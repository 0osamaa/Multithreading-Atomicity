package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicResource {

    java.util.concurrent.atomic.AtomicInteger count = new AtomicInteger(0);

    public Integer getCount() {
        return count.get();
    }

    public void increment (){
        count.incrementAndGet();
    }
}

package org.example;

public class AtomicInteger {

    public static void main(String[] args) {

        AtomicResource sharedResources = new AtomicResource();

        //Thread - 1
        new Thread(()  -> {
            System.out.println("Thread 1 is started");

                for(int i=0;i<5000; i++){
                    sharedResources.increment();
                }
            System.out.println("Thread 1 is completed");
        }).start();


        //Thread - 2
        new Thread(() -> {
            System.out.println("Thread 2 is started");

            for(int i=0;i<5000; i++){
                sharedResources.increment();
            }
            System.out.println("Thread 2 is completed");
        }).start();

        // Volatile thread waits for both threads to complete
        try {
            Thread.sleep(2000); // Sleep to allow threads to finish (not recommended for production)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + sharedResources.getCount());

    }

}

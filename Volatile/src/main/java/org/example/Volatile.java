package org.example;

public class Volatile {
    public static void main(String[] args) {
        VolatileResource sharedResources = new VolatileResource();


        //Thread - 1
        new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                System.out.println("Tread 1 logic start");
                Thread.sleep(1000);
                System.out.println("Thread 1 logic completed");
                sharedResources.setFlag(true);
                System.out.println("Flag set by Thread 1");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();


        //Thread - 2
        new Thread(() -> {
            System.out.println("Thread 2 is running");
            while (!sharedResources.getFlag()){

            }
            System.out.println("Thread 2 logic completed");
        }).start();
    }

}
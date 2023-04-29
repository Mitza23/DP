package org.example;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton singleton = Singleton.getSingleton();
//        System.out.println(singleton.getValue());
//
//        Singleton singleton2 = Singleton.getSingleton();
//        System.out.println(singleton2.getValue());
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future1 = executor.submit(new Task());
        Future<Integer> future2 = executor.submit(new Task());
        System.out.println(future1.get());
        System.out.println(future2.get());
    }
}
package org.example;

public class Singleton {
    private int value;
    volatile private static Singleton instance = null;
    private static int count = 1;
    private static final Integer obj= 1;

    private Singleton() {
        if (instance != null) {
            count += 1;
        }
        value = count;

    }

    public static Singleton getSingleton() {
        if(instance !=null) {
            return instance;
        }
        synchronized(obj) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public int getValue() {
        return value;
    }

}

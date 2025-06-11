package ru.valaubr.creational.singleton;

public class GoodSingleton {

    private static GoodSingleton uniqueInstance;
    private int value;

    private GoodSingleton() {
        value = 0;
    }

    public synchronized static GoodSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GoodSingleton();
        }
        return uniqueInstance;
    }

    public void incrementValue() {
        value++;
        System.out.println("good singleton value:" + value);
    }
}

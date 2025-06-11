package ru.valaubr.creational.singleton;

public class StandardSingleton {

    private static StandardSingleton uniqueInstance;
    private int value;

    private StandardSingleton() {
        value = 0;
    }

    public static StandardSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StandardSingleton();
        }
        return uniqueInstance;
    }

    public void incrementValue() {
        value++;
        System.out.println("standard singleton value:" + value);
    }
}

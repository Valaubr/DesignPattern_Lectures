package ru.valaubr.structure.facade;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Car car = new Car(new Engine(), new Door(), new Audio());

        car.start();
        System.out.println("Car is driving from A to B");
        car.stop();

    }
}

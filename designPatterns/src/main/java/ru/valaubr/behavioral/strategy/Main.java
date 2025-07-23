package ru.valaubr.behavioral.strategy;

import ru.valaubr.behavioral.strategy.realizations.BicycleDelivery;
import ru.valaubr.behavioral.strategy.realizations.CarDelivery;
import ru.valaubr.behavioral.strategy.realizations.WalkingDelivery;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int distance = rand.nextInt(0, 40);

        System.out.println(distance);
        DeliveryContext deliveryContext = new DeliveryContext();

        if (distance < 5) {
            deliveryContext.setStrategy(new WalkingDelivery());
            System.out.println(deliveryContext.runStrategy());
        } else if (distance < 10) {
            deliveryContext.setStrategy(new BicycleDelivery());
            System.out.println(deliveryContext.runStrategy());
        } else if (distance < 41) {
            deliveryContext.setStrategy(new CarDelivery());
            System.out.println(deliveryContext.runStrategy());
        }
    }
}

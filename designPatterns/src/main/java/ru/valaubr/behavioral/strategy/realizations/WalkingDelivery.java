package ru.valaubr.behavioral.strategy.realizations;

import ru.valaubr.behavioral.strategy.DeliveryStrategy;

import java.time.LocalDateTime;

public class WalkingDelivery implements DeliveryStrategy {

    @Override
    public String delivery() {
        return "Заказ был передан пешему доставщику ХХХ ХХХ ХХХ в " + LocalDateTime.now();
    }
}

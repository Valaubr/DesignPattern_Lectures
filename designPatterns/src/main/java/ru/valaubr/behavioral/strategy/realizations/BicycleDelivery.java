package ru.valaubr.behavioral.strategy.realizations;

import ru.valaubr.behavioral.strategy.DeliveryStrategy;

import java.time.LocalDateTime;

public class BicycleDelivery implements DeliveryStrategy {
    @Override
    public String delivery() {
        return "Заказ был передан велосипедному доставщику ХХХ ХХХ ХХХ в " + LocalDateTime.now();
    }
}

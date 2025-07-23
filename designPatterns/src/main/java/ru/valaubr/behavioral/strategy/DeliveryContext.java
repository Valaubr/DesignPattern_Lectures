package ru.valaubr.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryContext {
    private DeliveryStrategy strategy;

    public String runStrategy() {
        return strategy.delivery();
    }
}

package ru.valaubr.structure.decorator.decorator;

import lombok.AllArgsConstructor;
import ru.valaubr.structure.decorator.support.Topping;

@AllArgsConstructor
public class PizzaDecoratorTopping extends PizzaDecorator {

    private BasePizza pizzaDecorator;
    private Topping topping;

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription() + ", " + topping.toString();
    }

    @Override
    public float getCost() {
        return switch (topping) {
            case SOUSE -> pizzaDecorator.getCost() + 3.99f;
            case CHEESE -> pizzaDecorator.getCost() + 6.99f;
        };
    }
}

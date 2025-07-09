package ru.valaubr.structure.decorator.decorator;

import lombok.AllArgsConstructor;
import ru.valaubr.structure.decorator.support.Size;

@AllArgsConstructor
public class PizzaDecoratorSize extends PizzaDecorator {

    private BasePizza basePizza;
    private Size size;

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", " + size.toString();
    }

    @Override
    public float getCost() {
        return switch (size) {
            case SMALL -> basePizza.getCost() + 99.99f;
            case MEDIUM -> basePizza.getCost() + 149.99f;
            case LARGE -> basePizza.getCost() + 199.99f;
        };
    }
}

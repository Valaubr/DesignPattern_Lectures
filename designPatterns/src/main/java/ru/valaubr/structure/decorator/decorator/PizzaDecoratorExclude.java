package ru.valaubr.structure.decorator.decorator;

import lombok.AllArgsConstructor;
import ru.valaubr.structure.decorator.support.Ingredient;

@AllArgsConstructor
public class PizzaDecoratorExclude extends PizzaDecorator {

    private BasePizza pizzaDecorator;
    private Ingredient ingredient;

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription() + " " + ingredient.name();
    }

    @Override
    public float getCost() {
        return pizzaDecorator.getCost();
    }
}

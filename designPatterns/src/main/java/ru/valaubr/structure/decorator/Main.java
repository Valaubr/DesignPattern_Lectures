package ru.valaubr.structure.decorator;

import ru.valaubr.structure.decorator.decorator.*;
import ru.valaubr.structure.decorator.support.Ingredient;
import ru.valaubr.structure.decorator.support.Size;
import ru.valaubr.structure.decorator.support.Topping;
import ru.valaubr.structure.decorator.support.Type;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> pizzaInfo = Map.of("size", "large",
                "topping", "cheese",
                "exclude", "onion");
        BasePizza pizzaDecorator = new PizzaPeperoni();
        pizzaDecorator = new PizzaDecoratorSize(pizzaDecorator, Size.valueOf(pizzaInfo.get("size").toUpperCase()));
        pizzaDecorator = new PizzaDecoratorTopping(pizzaDecorator, Topping.valueOf(pizzaInfo.get("topping").toUpperCase()));
        pizzaDecorator = new PizzaDecoratorExclude(pizzaDecorator, Ingredient.valueOf(pizzaInfo.get("exclude").toUpperCase()));

        System.out.println(pizzaDecorator.getDescription() + " " + pizzaDecorator.getCost());
    }
}

package ru.valaubr.structure.composite.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

import static ru.valaubr.structure.composite.Cart.CART;

@AllArgsConstructor
@Getter
public class Menu implements MenuItem {

    private List<MenuItem> items;
    private String name;
    private String description;

    @Override
    public void add(MenuItem item) {
        items.add(item);
    }

    @Override
    public void remove(MenuItem item) {
        items.remove(item);
    }

    @Override
    public MenuItem getChild(int i) {
        return items.get(i);
    }

    @Override
    public int getChildSize() {
        return items.size();
    }

    @Override
    public List<MenuItem> getCart() {
        return CART;
    }
}

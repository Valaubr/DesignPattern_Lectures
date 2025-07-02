package ru.valaubr.structure.composite.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static ru.valaubr.structure.composite.Cart.CART;

@AllArgsConstructor
@Getter
public class Item implements MenuItem {

    private String name;
    private String description;

    @Override
    public void add(MenuItem item) {}

    @Override
    public void remove(MenuItem item) {}

    @Override
    public MenuItem getChild(int i) {
        return null;
    }

    @Override
    public int getChildSize() {
        return 0;
    }

    @Override
    public List<MenuItem> getCart() {
        return CART;
    }
}

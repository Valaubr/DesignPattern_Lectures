package ru.valaubr.structure.composite.menu;

import java.util.List;

public interface MenuItem {

    default void addToCart(MenuItem item) {
        if (item instanceof Item) {
            getCart().add(item);
            return;
        }
        System.out.println(item.getName() + " это меню а не блюдо");
    }

    String getName();

    String getDescription();

    void add(MenuItem item);

    void remove(MenuItem item);

    MenuItem getChild(int i);
    int getChildSize();

    List<MenuItem> getCart();
}

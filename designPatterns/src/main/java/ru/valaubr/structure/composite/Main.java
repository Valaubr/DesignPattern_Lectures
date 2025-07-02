package ru.valaubr.structure.composite;

import ru.valaubr.structure.composite.menu.Item;
import ru.valaubr.structure.composite.menu.Menu;
import ru.valaubr.structure.composite.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new Menu(
                List.of(
                        new Menu(List.of(
                                new Menu(List.of(
                                        new Item("Борщь", "Красный"),
                                        new Item("Пельмешки", "Вкусные"),
                                        new Item("Паста", "Капибара")
                                ), "Горячие блюда", "Те что согреют вас холодным вечером"),
                                new Menu(List.of(
                                        new Item("Акрошка на минералке", "На минералке"),
                                        new Item("Акрошка на квасе", "На квасе"),
                                        new Item("Мохито", "Блюдо???")
                                ), "Холодные блюда", "Те что охладят вас тёплым днём")
                        ),
                                "Первый Ресторан", "первый")),
                "Общее меню", "Общее меню"));
        printMenu(menuItems);
    }

    private static void printMenu(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName());
            if (menuItem instanceof Menu) {
                printMenu(((Menu) menuItem).getItems());
            }
        }
    }
}

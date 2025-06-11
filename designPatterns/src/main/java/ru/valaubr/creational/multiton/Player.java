package ru.valaubr.creational.multiton;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
abstract class Player {
    private String name;
    private int health;
    private int damage;
    private int xPos;
    private int yPos;
}

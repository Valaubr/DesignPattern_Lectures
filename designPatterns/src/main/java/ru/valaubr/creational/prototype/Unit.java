package ru.valaubr.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
abstract class Unit implements Cloneable {
    private String name;
    private int health;
    private int damage;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

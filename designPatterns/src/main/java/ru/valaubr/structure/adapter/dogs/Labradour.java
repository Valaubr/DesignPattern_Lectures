package ru.valaubr.structure.adapter.dogs;

import ru.valaubr.structure.adapter.interfaces.Dog;

public class Labradour implements Dog {
    @Override
    public void run() {
        System.out.println("Labradour run");
    }

    @Override
    public void bark() {
        System.out.println("Labradour bark");
    }

    @Override
    public void jump() {
        System.out.println("Labradour jump");
    }
}

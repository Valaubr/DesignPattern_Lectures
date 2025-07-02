package ru.valaubr.structure.adapter.cats;

import ru.valaubr.structure.adapter.interfaces.Cat;

public class Licoy implements Cat {
    @Override
    public void run() {
        System.out.println("Licoy run");
    }

    @Override
    public void meow() {
        System.out.println("Licoy meow");
    }

    @Override
    public void jump() {
        System.out.println("Licoy jump");
    }
}

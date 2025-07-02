package ru.valaubr.structure.adapter.cats;

import ru.valaubr.structure.adapter.interfaces.Cat;

public class MeinKun implements Cat {
    @Override
    public void run() {
        System.out.println("Meinkun run");
    }

    @Override
    public void meow() {
        System.out.println("Meinkun meow");
    }

    @Override
    public void jump() {
        System.out.println("Meinkun jump");
    }
}

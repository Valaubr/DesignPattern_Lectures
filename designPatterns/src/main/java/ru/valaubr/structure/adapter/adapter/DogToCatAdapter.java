package ru.valaubr.structure.adapter.adapter;

import ru.valaubr.structure.adapter.interfaces.Cat;
import ru.valaubr.structure.adapter.interfaces.Dog;

public class DogToCatAdapter implements Cat {

    private Dog dog;

    public DogToCatAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void run() {
        dog.run();
    }

    @Override
    public void meow() {
        dog.bark();
    }

    @Override
    public void jump() {
        dog.jump();
    }
}

package ru.valaubr.structure.adapter;

import ru.valaubr.structure.adapter.adapter.DogToCatAdapter;
import ru.valaubr.structure.adapter.cats.Licoy;
import ru.valaubr.structure.adapter.cats.MeinKun;
import ru.valaubr.structure.adapter.dogs.Labradour;
import ru.valaubr.structure.adapter.interfaces.Cat;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new MeinKun(), new Licoy(), new DogToCatAdapter(new Labradour()));
        cats.forEach(Cat::meow);
    }
}

package ru.valaubr.structure.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

    private Engine engine;
    private Door door;
    private Audio audio;

    public void start() {
        engine.on();
        door.open();
        audio.play();
    }

    public void stop() {
        audio.stop();
        door.close();
        engine.off();
    }
}

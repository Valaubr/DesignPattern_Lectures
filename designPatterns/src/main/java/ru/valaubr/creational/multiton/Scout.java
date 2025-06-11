package ru.valaubr.creational.multiton;

public class Scout extends Player {

    private UniquePerk sniperShoot;

    public Scout() {
        super("Стрелок", 100, 60, 0, 2);
    }

    private class UniquePerk {
        // Некий перк
    }
}

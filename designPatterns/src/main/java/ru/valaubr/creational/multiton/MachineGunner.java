package ru.valaubr.creational.multiton;

public class MachineGunner extends Player {

    private UniquePerk toTheGround;

    public MachineGunner() {
        super("Пулеметчик", 150, 40, 0, 1);
    }

    private class UniquePerk {
        // Некий перк
    }
}

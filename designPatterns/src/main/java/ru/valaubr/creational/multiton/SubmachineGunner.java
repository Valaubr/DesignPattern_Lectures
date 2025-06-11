package ru.valaubr.creational.multiton;

public class SubmachineGunner extends Player {

    private UniquePerk grenade;

    public SubmachineGunner() {
        super("Штурмовик", 120, 20, 0, 3);
    }

    private class UniquePerk {
        // Некий перк
    }
}

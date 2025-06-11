package ru.valaubr.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static SubmachineGunner submachineGunner = new SubmachineGunner();
    private static MachineGunner machineGunner = new MachineGunner();
    private static Scout scout = new Scout();

    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        callSquadTypeOne(units);
    }

    private static void callSquadTypeOne(List<Unit> units) {
        try {
            units.addAll(callSquadOne());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Unit> callSquadOne() throws CloneNotSupportedException {
        ArrayList<Unit> units = new ArrayList<Unit>();
        for (int i = 0; i < 5; i++) {
            units.add((Scout) scout.clone());
        }
        for (int i = 0; i < 2; i++) {
            units.add((SubmachineGunner) submachineGunner.clone());
        }
        units.add((MachineGunner) machineGunner.clone());
        return units;
    }
}

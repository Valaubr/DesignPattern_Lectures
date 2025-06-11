package ru.valaubr.creational.multiton;

import java.util.HashMap;
import java.util.Map;

public class PlayerSquadMultiton {
    private static final Map<String, Player> playerSquad = new HashMap<String, Player>();

    private PlayerSquadMultiton() {
    }

    public static synchronized Player getInstance(String name, String type) {
        if (!playerSquad.containsKey(name)) {
            switch (type.toUpperCase()) {
                case "MACHINEGUNNER":
                    playerSquad.put(name, new MachineGunner());
                    break;
                case "SUBMACHINEGUNNER":
                    playerSquad.put(name, new SubmachineGunner());
                    break;
                case "SCOUT":
                    playerSquad.put(name, new Scout());
                    break;
                default:
                    throw new IllegalArgumentException("Неверный ключ");
            }
        }
        return playerSquad.get(name);
    }
}

package ru.valaubr.creational.multiton;

public class Game {

    public void startGame() {
        Player player = PlayerSquadMultiton.getInstance("Valaubr", "MachineGunner");
        player.setXPos(10);
        player.setYPos(22);
        player = PlayerSquadMultiton.getInstance("Megamind", "Scout");
        player.setXPos(3);
        player.setXPos(4);
        player = PlayerSquadMultiton.getInstance("Valaubr", "MachineGunner");
        System.out.println(player.getName() + " postiton: x = " + player.getXPos() + " y = " + player.getYPos());
    }
}

package ru.valaubr.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zombie> zombies = new ArrayList<>();

        System.out.println("========Исследуюя метро ты услышал странный звук в одной из каморок=======");
        System.out.println("========Ты подумал что там могут быть выжившие и решил проверить=======");
        System.out.println("========Открыв дверь ты обнаружил " + zombies.size() + " зомби=======");
        System.out.println("========Черт, похоже отступить не получится, придется сражаться=======");

        for (Zombie zombie : zombies) {
            zombie.attack();
            if (zombie.takeDamage(10)) {
                zombies.remove(zombie);
            }
        }
    }
}

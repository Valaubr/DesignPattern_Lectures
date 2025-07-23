package ru.valaubr.behavioral.templatemethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Zombie {
    private String name;
    private int health;
    private int damage;

    // Шаблонный метод - определяет общий алгоритм поведения зомби
    public final void attack() {
        System.out.println("\n=== " + name + " начинает атаку ===");

        // неизменная часть алгоритма
        prepareAttack();

        // Уникальная часть алгоритма которая может быть изменена в реализации
        specificAttack();

        // неизменная часть алгоритма
        afterAttack();

        System.out.println("=== Атака завершена ===\n");
    }

    private void prepareAttack() {
        System.out.println(name + " готовится к атаке");
    }

    private void afterAttack() {
        System.out.println("Осталось здоровья: " + health);
    }

    public abstract void specificAttack();

    // хук (реализация по умолчанию, но может быть переопределена)
    public boolean takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " получает " + damage + " урона");
        if (this.health <= 0) {
            System.out.println(name + " падает на землю...");
            return true;
        }
        return false;
    }
}

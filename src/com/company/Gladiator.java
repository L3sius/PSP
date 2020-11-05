package com.company;

public class Gladiator extends Character implements Human, Warrior {
    void prayForRandomBuff() {
        System.out.println("Praying for random buff.");
    }

    void reduceDamageTaken() {
        System.out.println("Reducing damage taken.");
    }

    void takeAwayEnemyWeapon() {
        System.out.println("taking away enemy weapon!");
    }

    void throwHandfulOfSand() {
        System.out.println("Throwing handful of sand!");
    }
}

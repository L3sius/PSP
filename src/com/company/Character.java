package com.company;

public class Character {
    int level = 0;
    int money = 0;
    int strength = 0;
    int agility = 0;
    int intelligence = 0;
    String _class = null;
    String name = null;

    void levelUpCharacter(int level){
        this.level += level;
        System.out.println("Current Level is  " + level);
    }
    void upgradeCharacter(int strength,int agility,int intelligence) {
        this.strength += strength;
        this.agility += agility;
        this.intelligence += intelligence;
        System.out.println("Character upgraded!");
    }
    void calculatePower() {
        System.out.println("Character Power is " + (this.strength + this.agility + this.intelligence));
    }
    //void assignWeapon(weapon: Weapon) {}
}

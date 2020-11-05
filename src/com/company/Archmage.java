package com.company;

public class Archmage extends Character implements Elf, Wizard {
    void hideInShadows() {
        System.out.println("Hiding in shadows.");
    }

    void applyRandomCurse() {
        System.out.println("Casting random curse!");
    }

    void blinkTowards() {
        System.out.println("Blinking!");
    }

    void createPortal(String location) {
        System.out.println("Creating portal to " + location);
    }
}

package com.VideoGame.Player;

import com.VideoGame.DeveloperTools.GameElements;

public class PrimaryWeapon extends GameElements {
    private String name;
    private int damage;
    private double block;

    public PrimaryWeapon(String name, int damage, double block) {
        this.name = name;
        this.damage = damage;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public double getBlock() {
        return block;
    }
}

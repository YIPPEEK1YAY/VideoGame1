package com.VideoGame.Enemy;

public class Enemy {
    String type;
    double damage;
    double health;
    String weakness;

    public Enemy(String type, double damage, double health, String weakness) {
        this.type = type;
        this.damage = damage;
        this.health = health;
        this.weakness = weakness;

    }

    public String getType() {
        return type;
    }

    public double getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public String getWeakness() {
        return weakness;
    }
}

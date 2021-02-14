package com.VideoGame.NPC;

import com.VideoGame.DeveloperTools.GameElements;

public class Enemy extends GameElements {
    private String enemyType;
    private double damage;
    private double enemyHealth;
    private String weakness;
    private double weaknessMultiplier;
    private String naturalEnvironment;
    private double environmentMultiplier;

    public Enemy(String enemyType, double damage, double enemyHealth, String weakness, double weaknessMultiplier,
                 String naturalEnvironment, double environmentMultiplier) {
        this.enemyType = enemyType;
        this.damage = damage;
        this.enemyHealth = enemyHealth;
        this.weakness = weakness;
        this.weaknessMultiplier = weaknessMultiplier;
        this.naturalEnvironment = naturalEnvironment;
        this.environmentMultiplier = environmentMultiplier;

    }

    public double getWeaknessMultiplier() {
        return weaknessMultiplier;
    }

    public String getNaturalEnvironment() {
        return naturalEnvironment;
    }

    public double getEnvironmentMultiplier() {
        return environmentMultiplier;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public double getDamage() {
        return damage;
    }

    public double getEnemyHealth() {
        return enemyHealth;
    }

    public String getWeakness() {
        return weakness;
    }
}

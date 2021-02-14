package com.VideoGame.Battlefield;

public class Battlefield {
    String environment;
    double multiplier;

    public Battlefield(String environment, double multiplier) {
        this.environment = environment;
        this.multiplier = multiplier;

    }

    public String getEnvironment() {
        return environment;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

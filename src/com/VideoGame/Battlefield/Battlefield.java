package com.VideoGame.Battlefield;

import com.VideoGame.DeveloperTools.GameElements;

public class Battlefield extends GameElements {
    private String environmentType;
    private String environmentName;
    private double multiplier;

    public Battlefield(String environmentType, String environmentName, double multiplier) {
        this.environmentType = environmentType;
        this.environmentName = environmentName;
        this.multiplier = multiplier;

    }

    public String getEnvironmentType() {
        return environmentType;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

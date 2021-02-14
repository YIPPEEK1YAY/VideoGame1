package com.VideoGame.Race;

public class Power {
    private String powerElement;
    private String name;
    private double multiplier;

    public Power(String name, String inheritanceElement, double multiplier) {
        this.powerElement = inheritanceElement;
        this.multiplier = multiplier;
        this.name = name;
    }

    public String getPowerElement() {
        return powerElement;
    }

    public String getName() {
        return name;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

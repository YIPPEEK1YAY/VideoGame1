package com.VideoGame.Race;

public class Inheritance {
    private String inheritanceElement;
    private String name;
    private double multiplier;

    public Inheritance(String name, String inheritanceElement, double multiplier) {
        this.inheritanceElement = inheritanceElement;
        this.multiplier = multiplier;
        this.name = name;
    }

    public String getInheritanceElement() {
        return inheritanceElement;
    }

    public String getName() {
        return name;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

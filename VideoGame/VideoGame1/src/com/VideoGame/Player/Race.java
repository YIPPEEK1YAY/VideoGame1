package com.VideoGame.Character;

public class Race {
    private String name;
    private Power power;

    public Race(String name, Power power) {
        this.name = name;
        this.power = power;
    }

    public void attack() {

    }

    public void defend() {

    }

    public String getName() {
        return name;
    }

    public Power getPower() {
        return power;
    }
}

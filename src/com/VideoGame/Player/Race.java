package com.VideoGame.Player;

import com.VideoGame.Race.Power;

public class Race {
    private String race;
    private String name;
    private Power power;

    public Race(String race, String name, Power power) {
        this.race = race;
        this.name = name;
        this.power = power;
    }


    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public Power getPower() {
        return power;
    }
}

package com.VideoGame.Player;

import com.VideoGame.DeveloperTools.GameElements;

public class Player extends GameElements {
    private String characterName;
    private Race race;
    private PrimaryWeapon primaryWeapon;
    private double health;

    public Player (String characterName, Race race, PrimaryWeapon primaryWeapon, double health) {
        this.characterName = characterName;
        this.race = race;
        this.primaryWeapon = primaryWeapon;
        this.health = health;
    }



    public static void defend() {

    }

    public double getHealth() {
        return health;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Race getRace() {
        return race;
    }

    public PrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }
}


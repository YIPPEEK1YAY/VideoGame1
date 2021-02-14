package com.VideoGame;

import com.VideoGame.Character.Race;
import com.VideoGame.Weapon.PrimaryWeapon;

public class Player {
    private String characterName;
    private Race race;
    private PrimaryWeapon primaryWeapon;

    public Player (String characterName, Race race, PrimaryWeapon primaryWeapon) {
        this.characterName = characterName;
        this.race = race;
        this.primaryWeapon = primaryWeapon;
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


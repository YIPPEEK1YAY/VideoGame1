package com.VideoGame.Player;

import com.VideoGame.Race.*;
import com.VideoGame.Weapon.BattleAxe;
import com.VideoGame.Weapon.Mace;
import com.VideoGame.Weapon.Sword;

import java.util.Scanner;

public class CreatePlayer {


    public static Player createPlayer() {
        Race playerRace = chooseRace();
        PrimaryWeapon playerPrimary = choosePrimaryWeapon();
        String playerName = playerRace.getName();
        double health = 100;

        Player playerOne = new Player(playerName, playerRace, playerPrimary, health);

        return playerOne;
    }

    //----------------------------------------------------------
    private static String nameCharacter() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your character name: ");
        return scan.nextLine();
    }

    //---------------------------------------------------------
    private static Race chooseRace() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your Race (1, 2, or 3): ");
        System.out.println("1. High Elf");
        System.out.println("2. Dark Elf");
        System.out.println("3. Nord");
        System.out.println("4. White");
        String RaceChoice = scan.nextLine();
        Race yourRace = null;
        switch (RaceChoice) {
            case "1" -> {
                yourRace = createHighElf();
            }
            case "2" -> {
                yourRace = createDarkElf();
            }
            case "3" -> {
                yourRace = createNord();
            }
            case "4" -> {
                System.out.println("You won't make it far with that race, please try again.");
                chooseRace();
            }
            default -> {
                System.out.println("You need a Race! Try again.  ");
            }
        }

        return yourRace;
    }

    private static HighElf createHighElf() {
        String characterName = nameCharacter();
        String powerName = "Light of Elron";

        String powerElement = "Healing";
        String race = "High Elf";
        double powerMultiplier = 1.5;

        Power highElfPower = new Power(powerName, powerElement, powerMultiplier);

        HighElf newHighElf = new HighElf(race, characterName, highElfPower);
        return newHighElf;
    }

    private static DarkElf createDarkElf() {
        String characterName = nameCharacter();
        String race = "Dark Elf";

        String powerElement = "Fire";
        String powerName = "Summon Inferno";
        double powerMultiplier = 1.5;
        Power darkElfPower = new Power(powerName, powerElement, powerMultiplier);

        DarkElf newDarkElf = new DarkElf(race, characterName, darkElfPower);
        return newDarkElf;
    }

    private static Nord createNord() {
        String characterName = nameCharacter();
        String powerName = "Nordic Fury";

        String race = "Nord";
        String powerElement = "Strength";
        double powerMultiplier = 1.5;
        Power nordPower = new Power(powerName, powerElement, powerMultiplier);

        Nord newNord = new Nord(race, characterName, nordPower);
        return newNord;
    }

    //----------------------------------------------------------
    private static PrimaryWeapon choosePrimaryWeapon() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your primary weapon (1, 2, or 3): ");
        System.out.println("1. BattleAxe");
        System.out.println("2. Sword");
        System.out.println("3. Mace");
        String weaponChoice = scan.nextLine();
        PrimaryWeapon yourPrimary = null;

        switch (weaponChoice) {
            case "1" -> {
                yourPrimary = createBattleAxe();
            }
            case "2" -> {
                yourPrimary = createSword();
            }
            case "3" -> {
                yourPrimary = createMace();
            }
            default -> {
                System.out.println("You need a weapon! Try again.  ");
            }
        }
        return yourPrimary;
    }

    private static BattleAxe createBattleAxe() {
        int damage = 7;
        double block = .3;
        String name = "Storm Breaker";

        BattleAxe newBattleAxe = new BattleAxe(name, damage, block);
        return newBattleAxe;
    }

    private static Sword createSword() {
        int damage = 6;
        double block = .5;
        String name = "Goblin Slayer";

        Sword newSword = new Sword(name, damage, block);
        return newSword;
    }

    private static Mace createMace() {
        int damage = 9;
        double block = .1;
        String name = "Bone Crusher";

        Mace newMace = new Mace(name, damage, block);
        return newMace;
    }
}



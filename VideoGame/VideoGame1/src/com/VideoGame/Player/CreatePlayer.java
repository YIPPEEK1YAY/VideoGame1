package com.VideoGame;

import com.VideoGame.Character.*;
import com.VideoGame.Weapon.PrimaryWeapon;
import com.VideoGame.Weapon.BattleAxe;
import com.VideoGame.Weapon.Mace;
import com.VideoGame.Weapon.Sword;

import java.util.Scanner;

public class Campaign {
    public static void main(String[] args) {
        createPlayer();

    }

    public static Player createPlayer() {
        Race playerRace = chooseRace();
        PrimaryWeapon playerPrimary = choosePrimaryWeapon();
        String playerName = playerRace.getName();

        Player playerOne = new Player(playerName, playerRace, playerPrimary);
        System.out.println(playerOne.getCharacterName());
        System.out.println(playerOne.getRace().getPower().getMultiplier());

        return playerOne;
    }

    public static String nameCharacter() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your character name: ");
        return scan.nextLine();
    }

    public static Race chooseRace() {
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


    public static HighElf createHighElf() {
        String characterName = nameCharacter();

        String powerName = "Light of Elron";
        double powerMultiplier = 1.5;
        Power highElfPower = new Power(powerName, powerMultiplier);

        HighElf newHighElf = new HighElf(characterName, highElfPower);
        return newHighElf;
    }

    public static DarkElf createDarkElf() {
        String characterName = nameCharacter();

        String powerName = "Summon Inferno";
        double powerMultiplier = 1.5;
        Power darkElfPower = new Power(powerName, powerMultiplier);

        DarkElf newDarkElf = new DarkElf(characterName, darkElfPower);
        return newDarkElf;
    }

    public static Nord createNord() {
        String characterName = nameCharacter();

        String powerName = "Fury";
        double powerMultiplier = 1.5;
        Power nordPower = new Power(powerName, powerMultiplier);

        Nord newNord = new Nord(characterName, nordPower);
        return newNord;
    }

    public static PrimaryWeapon choosePrimaryWeapon() {
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

    public static BattleAxe createBattleAxe() {
        int damage = 7;
        double block = .3;
        String name = "Storm Breaker";

        BattleAxe newBattleAxe = new BattleAxe(name, damage, block);
        return newBattleAxe;
    }

    public static Sword createSword() {
        int damage = 6;
        double block = .5;
        String name = "Goblin Slayer";

        Sword newSword = new Sword(name, damage, block);
        return newSword;
    }

    public static Mace createMace() {
        int damage = 9;
        double block = .1;
        String name = "Bone Crusher";

        Mace newMace = new Mace(name, damage, block);
        return newMace;
    }
}



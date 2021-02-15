package com.VideoGame.Battle1;

import com.VideoGame.BattleScene.BattleScene;
import com.VideoGame.Battlefield.Battlefield;

import com.VideoGame.NPC.Enemy;
import com.VideoGame.Player.Player;
import com.VideoGame.Player.PrimaryWeapon;
import com.VideoGame.Player.Race;
import com.VideoGame.Race.Power;

import java.util.Scanner;

import static com.VideoGame.BattleScene.CreateBattleScene.createBattleScene;


public class Battle1 {
    private static BattleScene battle1 = createBattleScene();

    //BattleScene elements
    private static String battleName = battle1.getBattleName();
    private static Player playerInBattle = battle1.getPlayerInBattle();
    private static Battlefield battlefield = battle1.getBattlefield();
    private static Enemy enemy = battle1.getEnemy();

    //Player Elements
    private static String characterName = playerInBattle.getCharacterName();
    private static Race race = playerInBattle.getRace();
    private static PrimaryWeapon primaryWeapon = playerInBattle.getPrimaryWeapon();
    private static double health = playerInBattle.getHealth();

    //Battlefield Elements
    private static String environmentType = battlefield.getEnvironmentType();
    private static String environmentName = battlefield.getEnvironmentName();
    private static double multiplier = battlefield.getMultiplier();

    //Enemy Elements
    private static String enemyType = enemy.getEnemyType();
    private static double damage = enemy.getDamage();
    private static double enemyHealth = enemy.getEnemyHealth();
    private static String weakness = enemy.getWeakness();
    private static double weaknessMultiplier = enemy.getWeaknessMultiplier();
    private static String naturalEnvironment = enemy.getNaturalEnvironment();
    private static double environmentMultiplier = enemy.getEnvironmentMultiplier();

    //Race Elements
    private static String raceType = race.getRace();
    private static String name = race.getName();
    private static Power power = race.getPower();

    //Primary Weapon Elements
    private static String weaponName = primaryWeapon.getName();
    private static int primaryWeaponDamage = primaryWeapon.getDamage();
    private static double primaryWeaponBlock = primaryWeapon.getBlock();

    //Power Elements
    private static String powerElement = power.getPowerElement();
    private static String powerName = power.getName();
    private static double powerMultiplier = power.getMultiplier();


    public static void main(String[] args) {
        startBattle();
    }

    private static void startBattle() {
        System.out.println("Battlefield: " + environmentName);
        System.out.println("Environment: " + environmentType);
        System.out.println();

        System.out.println("Enemy: " + enemyType);
        System.out.println();

        System.out.println("1. Attack");
        System.out.println("2. Flee");

        Scanner scan = new Scanner(System.in);


        while (enemyHealth > 0) {
            String action = scan.nextLine();
            switch (action) {
                case "1" -> {
                    enemyHealth -= playerMeleeAttack();
                    System.out.println(enemyType + " health: " + enemyHealth);
                }
                //case "2" ->
            }
        }
        System.out.println(enemyType + " defeated!");
    }


    private static double playerMeleeAttack() {
        double totalDamage = primaryWeaponDamage * powerMultiplier;
        return totalDamage;
    }

    private static double enemyMeleeAttack(int damage, double environmentMultiplier) {
        double totalDamage = damage * environmentMultiplier;
        return totalDamage;
    }
}
//test commit note
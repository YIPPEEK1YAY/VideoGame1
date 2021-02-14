package com.VideoGame.NPC;

import com.VideoGame.Battlefield.Battlefield;

public class CreateEnemy {

    public static Enemy createRandomEnemy(Battlefield newBattlefield) {
        int randomInt = (int) (Math.random() * (3 - 1) + 1);
        Enemy yourEnemy;

        switch (randomInt) {
            case (1) -> yourEnemy = createSerpent(newBattlefield.getEnvironmentType());
            case (2) -> yourEnemy = createSkeleton(newBattlefield.getEnvironmentType());
            default -> throw new IllegalStateException("Unexpected value: " + randomInt);
        }
        return yourEnemy;
    }

    private static Serpent createSerpent(String environmentType) {
        String enemy = "Serpent";
        double damage = 5;
        double health = 100;
        String weakness = "Fire";
        double weaknessMultiplier = 1;
        String naturalEnvironment = "Forest";
        double environmentMultiplier;

        switch (environmentType) {
            case "Forest" -> environmentMultiplier = 1.15;
            case "Ruin" -> environmentMultiplier = .93;
            default -> throw new IllegalStateException("Unexpected value: " + environmentType);
        }
        Serpent newSerpent = new Serpent(enemy, damage, health, weakness, weaknessMultiplier,
                naturalEnvironment, environmentMultiplier);

        return newSerpent;
    }

    private static Skeleton createSkeleton(String environmentType) {
        String enemy = "Skeleton";
        double damage = 5;
        double health = 100;
        String weakness = "None";
        double weaknessMultiplier = 1;
        String naturalEnvironment = "Ruin";
        double environmentMultiplier;

        switch (environmentType) {
            case "Forest" -> environmentMultiplier = .93;
            case "Ruin" -> environmentMultiplier = 1.15;
            default -> throw new IllegalStateException("Unexpected value: " + environmentType);
        }
        Skeleton newSkeleton = new Skeleton(enemy, damage, health, weakness, weaknessMultiplier,
                naturalEnvironment, environmentMultiplier);

        return newSkeleton;
    }
}

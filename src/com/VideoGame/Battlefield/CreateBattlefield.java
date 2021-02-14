package com.VideoGame.Battlefield;

import com.VideoGame.Player.Player;

public class CreateBattlefield {


    public static Battlefield createRandomBattlefield(Player playerOne) {
        int randomInt = (int) (Math.random() * (3 - 1) + 1);
        Battlefield yourBattlefield;

        switch (randomInt) {
            case (1) -> yourBattlefield = createRuin(playerOne.getRace().getRace());
            case (2) -> yourBattlefield = createForest(playerOne.getRace().getRace());
            default -> throw new IllegalStateException("Unexpected value: " + randomInt);
        }
        return yourBattlefield;
    }

    private static Ruin createRuin(String playerRace) {
        String environmentType = "Ruin";
        String environmentName = "Dagledore Fortress";
        double multiplier = 0;
        switch (playerRace) {
            case "High Elf" -> multiplier = .9;
            case "Dark Elf" -> multiplier = 1.15;
            case "Nord" -> multiplier = 1;
            default -> multiplier = 0;
        }

        Ruin newRuin = new Ruin(environmentType, environmentName, multiplier);

        return newRuin;
    }

    private static Forest createForest(String playerRace) {
        String environmentType = "Forest";
        String environmentName = "Aurora's Forest";
        double multiplier = 0;

        switch (playerRace) {
            case "High Elf" -> multiplier = 1.15;
            case "Dark Elf" -> multiplier = .98;
            case "Nord" -> multiplier = 1;
            default -> multiplier = 0;
        }

        Forest newForest = new Forest(environmentType, environmentName, multiplier);

        return newForest;
    }
}

package com.VideoGame.BattleScene;

import com.VideoGame.Battlefield.Battlefield;
import com.VideoGame.NPC.Enemy;
import com.VideoGame.Player.Player;
import com.VideoGame.Battlefield.Battlefield;

import static com.VideoGame.Battlefield.CreateBattlefield.createRandomBattlefield;
import static com.VideoGame.NPC.CreateEnemy.createRandomEnemy;
import static com.VideoGame.Player.CreatePlayer.createPlayer;

public class CreateBattleScene {


    public static BattleScene createBattleScene() {
        String battleName = "The Battle That May Never Happen";
        Player newPlayer = createPlayer();
        Battlefield newBattlefield = createRandomBattlefield(newPlayer);
        Enemy newEnemy = createRandomEnemy(newBattlefield);

        BattleScene newBattle = new BattleScene(battleName, newPlayer, newBattlefield, newEnemy);

        return newBattle;
    }


}

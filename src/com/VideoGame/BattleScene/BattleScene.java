package com.VideoGame.BattleScene;

import com.VideoGame.Battlefield.Battlefield;
import com.VideoGame.DeveloperTools.GameElements;
import com.VideoGame.NPC.Enemy;
import com.VideoGame.Player.Player;

import java.util.Random;

public class BattleScene extends GameElements {
    private String battleName;
    private Player playerInBattle;
    private Battlefield battlefield;
    private Enemy enemy;

    public BattleScene(String battleName, Player playerInBattle, Battlefield battlefield, Enemy enemy) {
        this.battleName = battleName;
        this.playerInBattle = playerInBattle;
        this.battlefield = battlefield;
        this.enemy = enemy;
    }

    public String getBattleName() {
        return battleName;
    }

    public Player getPlayerInBattle() {
        return playerInBattle;
    }

    public Battlefield getBattlefield() {
        return battlefield;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}

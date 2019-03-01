package com.frankeser.game.display;

import com.frankeser.game.misc.Coin;
import com.frankeser.game.misc.Player;
import com.frankeser.game.play.Game;

import java.util.ArrayList;

public class Grid implements Game {
    private int width;
    private int height;
    private int maxRandomCoins;
    private boolean coinsSet = false;

    // GAME LOOP
    private Coin[][] coins = new Coin[height][width];
    private Player[][] players = new Player[height][width];

    public Grid(int width, int height, int maxRandomCoins, ArrayList<Player> players) {
        if(players.size() > 2) {
            System.out.println("ERROR! CURRENTLY ONLY 2 PLAYERS ARE SUPPORTED!");
            return;
        }

        this.width = width;
        this.height = height;
        this.maxRandomCoins = maxRandomCoins;

        // TODO PUT PLAYERS IN EXTREMES
        spreadPlayers(players);

        // TODO RANDOM LOCATION FOR COINS
    }

    public void displayGrid() {

    }

    private void spreadPlayers(ArrayList<Player> players) {
        // FIRST
        this.players[0][width] = players.get(0);

        // SECOND
        this.players[height][0] = players.get(1);
    }

    private void spreadCoins() {
        if(!this.coinsSet) {
            
            this.coinsSet = true;
        } else return;
    }

    @Override
    public void battle() {

    }

    @Override
    public void movePlayer() {

    }
}

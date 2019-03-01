package com.frankeser.game.misc;

import jdk.jfr.Description;

public class Player {
    private String username;
    private int coins;
    private Location location;

    public Player(String username, Location location) {
        this.username = username;
        this.location = location;
        this.coins = 0;
    }

    @Description("Used to get the username of the player")
    public String getUsername() {
        return this.username;
    }

    @Description("Used to get the current coin balance of the player")
    public int getCoins() {
        return this.coins;
    }

    public Location getLocation() {
        return location;
    }

    @Description("Used to subtract a coin from the player")
    public void removeCoin() {
        this.coins--;
    }

    @Description("Used to add a coin to the player")
    public void addCoin() {
        this.coins++;
    }
}

package com.frankeser.game.misc;

public class Coin {
    private int value;
    private Location location;

    public Coin(int value, Location location) {
        this.value = value;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public Location getLocation() {
        return location;
    }
}

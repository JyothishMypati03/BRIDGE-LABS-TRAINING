package com.bridge.playerqueue;

public class PlayerNode {

    // Store player object
    Player player;

    // Reference to next node
    PlayerNode next;

    // Constructor
    public PlayerNode(Player player) {

        this.player = player;
        this.next = null;
    }
}
package com.bridge.playerqueue;

public class PlayerQueue {

    // Front and Rear of Queue
    private PlayerNode front;
    private PlayerNode rear;

    // Constructor
    public PlayerQueue() {

        front = null;
        rear = null;
    }

    // Check whether queue is empty
    public boolean isEmpty() {

        return front == null;
    }

    // Add player to queue
    public void enqueue(Player player) {

        PlayerNode newNode = new PlayerNode(player);

        if (isEmpty()) {

            front = rear = newNode;
        }
        else {

            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove player from queue
    public Player dequeue() {

        if (isEmpty()) {

            return null;
        }

        Player player = front.player;

        front = front.next;

        if (front == null) {

            rear = null;
        }

        return player;
    }

    // Display players and their cards
    public void displayPlayers() {

        PlayerNode current = front;

        while (current != null) {

            current.player.sortCards();

            current.player.displayCards();

            current = current.next;
        }
    }
}
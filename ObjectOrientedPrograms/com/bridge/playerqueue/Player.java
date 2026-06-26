package com.bridge.playerqueue;

public class Player {

    // Instance variables
    private String playerName;
    private Queue cards;

    // Constructor
    public Player(String playerName) {

        this.playerName = playerName;
        this.cards = new Queue();
    }

    // Add card to player's queue
    public void addCard(Card card) {

        cards.enqueue(card);
    }

    // Sort cards by rank (Bubble Sort using Linked List)
    public void sortCards() {

        Node current;
        Node index;

        for (current = cards.getFront(); current != null; current = current.next) {

            for (index = current.next; index != null; index = index.next) {

                if (current.card.getRankValue() > index.card.getRankValue()) {

                    Card temp = current.card;
                    current.card = index.card;
                    index.card = temp;
                }
            }
        }
    }

    // Display player's cards
    public void displayCards() {

        System.out.println("\n" + playerName);
        System.out.println("------------------------");

        cards.display();
    }

    // Getter for player name
    public String getPlayerName() {

        return playerName;
    }

    // Getter for queue
    public Queue getCards() {

        return cards;
    }
}
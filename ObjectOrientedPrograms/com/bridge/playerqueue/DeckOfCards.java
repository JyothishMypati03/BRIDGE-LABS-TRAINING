package com.bridge.playerqueue;

import java.util.Random;

public class DeckOfCards {

    public static void main(String[] args) {

        // Suits
        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        // Ranks
        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Create deck of 52 cards
        Card[] deck = new Card[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] = new Card(suit, rank);
            }
        }

        // Shuffle cards
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomIndex = random.nextInt(deck.length);

            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Create 4 players
        Player[] players = new Player[4];
        PlayerQueue playerQueue = new PlayerQueue();

        for (int i = 0; i < 4; i++) {

            players[i] = new Player("Player " + (i + 1));

            playerQueue.enqueue(players[i]);
        }

        // Distribute 9 cards to each player
        index = 0;

        for (int card = 0; card < 9; card++) {

            for (int player = 0; player < 4; player++) {

                players[player].addCard(deck[index++]);
            }
        }

        // Sort and display cards
        System.out.println("========== PLAYERS & CARDS ==========");

        playerQueue.displayPlayers();
    }
}
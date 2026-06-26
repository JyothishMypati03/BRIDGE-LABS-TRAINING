package com.bridge.deckofcards;

import java.util.Random;

public class DeckOfCards {

    public static void main(String[] args) {

        // Suits
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // Ranks
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        // Create deck of 52 cards
        String[] deck = new String[52];

        int index = 0;

        // Initialize deck
        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle deck
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomIndex = random.nextInt(deck.length);

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Distribute 9 cards to 4 players using 2D array
        String[][] players = new String[4][9];

        index = 0;

        for (int player = 0; player < 4; player++) {

            for (int card = 0; card < 9; card++) {

                players[player][card] = deck[index++];
            }
        }

        // Display cards
        for (int player = 0; player < 4; player++) {

            System.out.println("\nPlayer " + (player + 1) + " Cards");

            System.out.println("--------------------------");

            for (int card = 0; card < 9; card++) {

                System.out.println(players[player][card]);
            }
        }
    }
}
package com.bridge.playerqueue;

public class Card {

    // Instance variables
    private String suit;
    private String rank;

    // Constructor
    public Card(String suit, String rank) {

        this.suit = suit;
        this.rank = rank;
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Getter for rank
    public String getRank() {
        return rank;
    }

    // Method to get rank value for sorting
    public int getRankValue() {

        switch (rank) {

            case "2":
                return 2;

            case "3":
                return 3;

            case "4":
                return 4;

            case "5":
                return 5;

            case "6":
                return 6;

            case "7":
                return 7;

            case "8":
                return 8;

            case "9":
                return 9;

            case "10":
                return 10;

            case "Jack":
                return 11;

            case "Queen":
                return 12;

            case "King":
                return 13;

            case "Ace":
                return 14;

            default:
                return 0;
        }
    }

    // Display card
    @Override
    public String toString() {

        return rank + " of " + suit;
    }
}
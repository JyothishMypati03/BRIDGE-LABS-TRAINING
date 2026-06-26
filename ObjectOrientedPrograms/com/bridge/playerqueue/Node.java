package com.bridge.playerqueue;

public class Node {

    // Store card object
    Card card;

    // Reference to next node
    Node next;

    // Constructor
    public Node(Card card) {

        this.card = card;
        this.next = null;
    }
}
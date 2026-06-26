package com.bridge.playerqueue;

public class Queue {

    // Front and Rear of the Queue
    private Node front;
    private Node rear;

    // Constructor
    public Queue() {

        front = null;
        rear = null;
    }

    // Check whether queue is empty
    public boolean isEmpty() {

        return front == null;
    }

    // Add card to queue
    public void enqueue(Card card) {

        Node newNode = new Node(card);

        if (isEmpty()) {

            front = rear = newNode;
        }
        else {

            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove card from queue
    public Card dequeue() {

        if (isEmpty()) {

            return null;
        }

        Card card = front.card;

        front = front.next;

        if (front == null) {

            rear = null;
        }

        return card;
    }

    // Display cards in queue
    public void display() {

        Node current = front;

        while (current != null) {

            System.out.println(current.card);

            current = current.next;
        }
    }

    // Return front node (used for sorting)
    public Node getFront() {

        return front;
    }
}
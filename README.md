## Deck of Cards Using Queue and Linked List

### Description

This use case extends the Deck of Cards program by creating a `Player` object for each player. Each player maintains a deck of cards in a **Queue implemented using a Linked List** without using any Java Collection Library. The cards are sorted by rank before being displayed. The players themselves are also maintained in a queue and printed along with their sorted cards.

### Objectives

* Create a `Player` object for each player.
* Store each player's cards in a Queue implemented using a Linked List.
* Sort the cards according to their rank.
* Arrange all players in a Queue.
* Display each player and the cards received.

### Assumptions

* A standard deck contains **52 cards**.
* Suits:

    * Clubs
    * Diamonds
    * Hearts
    * Spades
* Ranks:

    * 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace
* Four players participate in the game.
* Each player receives **9 cards**.
* No Java Collection Library is used.

### Algorithm

1. Create a `Card` class to represent a playing card.
2. Create a `Node` class for implementing a Queue using a Linked List.
3. Create a `Queue` class to store cards.
4. Create a `Player` class containing a Queue of cards.
5. Create `PlayerNode` and `PlayerQueue` classes to maintain players in a queue.
6. Initialize a deck of 52 cards.
7. Shuffle the deck using the `Random` class.
8. Distribute 9 cards to each of the 4 players.
9. Store each player's cards in a Queue.
10. Sort the cards by rank.
11. Enqueue all players into the player queue.
12. Display each player and the sorted cards received.

### Classes Used

```java id="jlwmch"
Card
Node
Queue
Player
PlayerNode
PlayerQueue
DeckOfCards
```

### Important Methods

```java id="tvlhya"
public void enqueue(Card card)

public Card dequeue()

public void sortCards()

public void displayCards()

public void displayPlayers()
```

### Benefits

* Demonstrates Queue implementation using a Linked List.
* Avoids the use of Java Collection Library.
* Demonstrates object-oriented programming using multiple classes.
* Sorts cards by rank before displaying them.
* Simulates real-world card distribution among players.
* Improves understanding of linked lists, queues, and sorting algorithms.

### Sample Output

```text id="g2bnzq"
========== PLAYERS & CARDS ==========

Player 1
------------------------
2 of Clubs
4 of Hearts
8 of Diamonds
10 of Spades
Jack of Clubs
Queen of Hearts
King of Diamonds
Ace of Clubs
Ace of Spades

Player 2
------------------------
3 of Hearts
5 of Clubs
6 of Diamonds
7 of Spades
9 of Hearts
10 of Clubs
Queen of Diamonds
King of Hearts
Ace of Diamonds

Player 3
------------------------
...

Player 4
------------------------
...
```

**Note:** The output will vary every time the program is executed because the deck of cards is shuffled randomly before distribution.

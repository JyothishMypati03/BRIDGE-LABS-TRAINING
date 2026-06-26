## Deck of Cards

### Description

This use case implements a Deck of Cards program that initializes a standard deck of 52 playing cards using four suits and thirteen ranks. The deck is shuffled using the `Random` class, and 9 cards are distributed to each of 4 players using a two-dimensional array.

### Objectives

* Initialize a standard deck of 52 cards.
* Shuffle the deck randomly.
* Distribute 9 cards to each of 4 players.
* Store the distributed cards using a 2D array.
* Display the cards received by each player.

### Assumptions

* The deck contains 52 unique cards.
* Suits:

    * Clubs
    * Diamonds
    * Hearts
    * Spades
* Ranks:

    * 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace
* Each player receives exactly 9 cards.
* The remaining cards are left unused.

### Algorithm

1. Create arrays for suits and ranks.
2. Initialize a deck of 52 cards by combining every rank with every suit.
3. Shuffle the deck using the `Random` class.
4. Create a 2D array of size `4 × 9` to represent 4 players and their cards.
5. Distribute the first 36 shuffled cards among the players.
6. Display the cards received by each player.

### Classes Used

```java
DeckOfCards
```

### Important Concepts

```java
Random
Arrays
2D Array
Nested Loops
```

### Benefits

* Demonstrates the use of arrays and two-dimensional arrays.
* Implements random shuffling of data.
* Simulates real-world card distribution.
* Improves understanding of nested loops and array manipulation.
* Provides a foundation for card game applications.

### Sample Output

```text
Player 1 Cards
--------------------------
King of Hearts
4 of Clubs
Ace of Spades
10 of Diamonds
2 of Hearts
Queen of Clubs
9 of Spades
5 of Diamonds
Jack of Hearts

Player 2 Cards
--------------------------
3 of Clubs
Ace of Diamonds
7 of Hearts
King of Clubs
8 of Spades
10 of Hearts
5 of Clubs
Queen of Diamonds
2 of Spades

Player 3 Cards
--------------------------
...
```

**Note:** The output will vary each time the program is executed because the deck is shuffled randomly before distributing the cards.

# java-assignment-4

#Overview

This Java program simulates a deck of 52 playing cards, allowing various operations such as shuffling, dealing cards, searching for specific cards, and displaying cards based on suits or ranks.

##Features

1) Create a deck of 52 standard playing cards

2) Print the entire deck

3) Print a specific card

4) Shuffle the deck

5) Deal 5 random cards

6) Find a specific card in the deck

7) Display all cards of a given suit

8) Display all cards of a given rank

##Class Descriptions

a) Card

Represents an individual playing card with a rank and a suit.

Overrides toString() to display the card in "Rank of Suit" format.

b) Deck

Manages the deck of 52 cards.

Methods:

1) createDeck(): Initializes the deck.

2) printDeck(): Prints all cards in the deck.

3) printCard(Card card): Prints a specific card.

4) sameCard(String suit): Displays all cards of a given suit.
   
5)compareCard(String rank): Displays all cards of a given rank.

6) findCard(String rank, String suit): Checks if a specific card exists in the deck.

7) dealCard(): Deals 5 random cards from the deck.

8) shuffleDeck(): Randomizes the deck order.

Menu Options

1) When running the program, the user can choose from the following options:

2) Print the deck

3) Shuffle the deck

4) Deal 5 random cards

5) Find a specific card

6) Display all cards of a given suit

7) Display all cards of a given rank

8) Pick 2 random cards

9) Distribute cards to 3 players

10) Exit the program

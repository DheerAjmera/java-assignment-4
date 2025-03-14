//Name - Dheer Ajmera
//PRN - 23070126035
//AIML - A2


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Menu-driven program for deck operations
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        while (true) {
            System.out.println("\nCARD DECK MENU");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Find a Particular Card");
            System.out.println("5. Display Cards of a Suit");
            System.out.println("6. Display Cards of a Rank");
            System.out.println("7. Pick 2 Random Cards");
            System.out.println("8. Distribute Cards to 3 Players");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    deck.dealCard();
                    break;
                case 4:
                    System.out.print("Enter Rank: ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter Suit: ");
                    String suit = scanner.nextLine();
                    boolean found = deck.findCard(rank, suit);
                    if (found) {
                        System.out.println("Card is in the deck.");
                    } else {
                        System.out.println("Card is not in the deck.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Suit: ");
                    String suitSearch = scanner.nextLine();
                    deck.sameCard(suitSearch);
                    break;
                case 6:
                    System.out.print("Enter Rank: ");
                    String rankSearch = scanner.nextLine();
                    deck.compareCard(rankSearch);
                    break;
                case 7:
                    deck.randomCards();
                    break;
                case 8:
                    deck.cardPlayers();
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

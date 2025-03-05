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

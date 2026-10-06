package Battleship;

import java.util.Scanner;

public class Battleship 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int boardSize = 10;  
        int shipSize = 3; 
        int[] hits = new int[boardSize];

        Board board = new Board(boardSize);
        board.placeShip(shipSize);

        int hitsRemaining = shipSize; 
        int guesses = 0;

        while (hitsRemaining > 0) 
        {
            System.out.print("Enter a position to guess (0 to 9): ");
            int guess = kb.nextInt();

            if (guess < 0 || guess >= boardSize) 
            {
                System.out.println("Invalid position. Please try again.");
                continue;
            }

            if (hits[guess] != 0) 
            {
                System.out.println("You've already guessed this position. Try again.");
                continue;
            }

            guesses++; 

            if (board.getBoard()[guess] == 1) 
            {
                hits[guess] = 1; 
                hitsRemaining--; 
                System.out.println("Hit!");

                if (hitsRemaining == 0) {
                    System.out.println("Congratulations! You've sunk the ship in " + guesses + " guesses.");
                }
            } 
            else 
            {
                hits[guess] = -1; 
                System.out.println("Miss.");
            }
        }

        kb.close();
    }
}

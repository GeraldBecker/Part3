package q1;

import java.util.Scanner;
import java.util.Random;

/**
 * <p> Play a game where the user guesses a number from 1 to 10.
 * If the user guesses a number too low, the program will tell them 
 * and force them to make another guess. If the guess is too high, it will 
 * tell them the guess was too high.
 * It will print out the number of guesses that were high, low and total 
 * guesses.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class Guess {
    /**
     * Sets the number of numbers (difficulty) the user has to guess between.
     */
    static final int NUM_RANGE = 10;
    
    /**
     * Sets the beginning of the guessing range. 
     */
    static final int NUM_START = 1;
    
    /**
     * Gets the user to guess a random number.
     * @param args no used
     */
    public static void main(String[] args) {
        int numToGuess; //Number the user tries to guess
        int guess = 0; //The user's guess
        int highGuesses = 0; // number of guesses higher than the number
        int lowGuesses = 0; // number of guesses lower than the number
        int totalGuesses = 0; // total number of guesses
        
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        // randomly generate the number to guess
        numToGuess = generator.nextInt(NUM_RANGE) + NUM_START;
        
        // print message asking user to enter a guess
        System.out.print("Guess a number between " + NUM_START + " and "
                + (NUM_RANGE + NUM_START - 1) + ": ");
        
        // loop until the correct number is guessed
        while (guess != numToGuess) { 
            guess = scan.nextInt();
            // increment the total guesses as an input was just made
            totalGuesses++;
            
            if (guess > numToGuess) { // when the guess is too high
                System.out.print("Your guess is too high, guess again: ");
                highGuesses++;
            } else if (guess < numToGuess) { // when the guess is too low
                System.out.print("Your guess is too low, guess again: ");
                lowGuesses++;
            } else { // when the guess is correct
                System.out.print("Congratulations, you guessed the correct"
                        + " number: ");
            }
        }
        
        // close the scanner as it is no longer used
        scan.close();
        
        // print the results 
        System.out.print(numToGuess + "\nNumber of higher guesses: " 
                + highGuesses + "\nNumber of lower guesses: " + lowGuesses 
                + "\nTotal number of guesses: " + (totalGuesses));
    }
}

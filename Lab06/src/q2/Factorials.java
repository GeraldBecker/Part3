package q2;

import java.util.Scanner;

/**
 * <p> Computes the factorial of n! and makes sure that the user does not
 * enter in an invalid non-negative integer.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class Factorials {
    /**
     * Calculates the factorial of n.
     * @param args not used
     */
    public static void main(String[] args) {
        // number to compute factorials up to. Starts at -1 to enter loop
        int n = -1; 
        int count = 1;
        int factorial = 1; // resulting factorial answer 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a factorial n! number (non-negative integer)"
                + " to compute: ");
        
        // prompt user for a non-integer value until valid
        while (n < 0) {
            n = scan.nextInt();
            if (n < 0) {
                System.out.print("Please follow the instructions. A "
                        + "non-negative integer is required. Enter a number "
                        + "0 or greater: ");
            }
        }
        
        // close the scanner as it is no longer required.
        scan.close();
            
        // compute the factorial answer
        while (count <= n && n != 0) {
            factorial *= count;
            count++;
        }
        
        System.out.println("The factorial of " + n + "! = " + factorial);
    }

}

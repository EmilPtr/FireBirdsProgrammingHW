/********************************************************************************************************************
 * Solution to the loops 2 problem.                                                                                 *
 * Created by Emil on 2025-07-14                                                                                    *
 * This program reads a string input from the user and removes the first leter, and prints the result sequentially. *
 * It continues to remove the first letter until no characters are left to print.                                   *
 * The program uses a do-while loop to achieve this.                                                                *
 ********************************************************************************************************************/

package U1_L1;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        String input = sc.nextLine().trim(); // Read user input and trim any leading or trailing whitespace
        int startP = 0; // Create hypothetical start pointer that will be moved forwards
        do {
            System.out.println(input.substring(startP, input.length())); // Prints a portion of the input, from the start pointer to the end
            startP++; // Moves the start pointer forward by one character
        } while (startP < input.length()); // Continue until the start pointer reaches the length of the input string
        System.out.println("");
    }       
}

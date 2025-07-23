/**********************************************************************************
 * Solution to the IdealTypes.java exercise                                       *
 * Created by Emil on 2025-07-14                                                  *
 * This program demonstrates the use of various data types in Java                *
 * and explains the ideal data types for different scenarios.                     *
 * It includes examples of float, int, char, String, double, and long.            *
 * Each variable is initialized with a value that represents its ideal use case.  *
 **********************************************************************************/

package U1_L1;

public class IdealTypes {
    private float money = (float) 1.30; // Ideal datatype for money is float, because it is a large number, with some decimals.
    private int sumOfSeriesOfNaturalNumbers = 1 + 2 + 3 + 4 + 5; // Ideal datatype for sum of series of natural numbers is int, because it is a medium sized number, and natural numbers do not have decimals
    private char aSingleLetter = 'a' ; // Ideal datatype for a single letter is char, because it is a single character
    private String robotName = "Rotisserie Chicken"; // Ideal datatype for a name is String, because it is a sequence of characters
    private double volumeOfSphere = (4/3) * Math.PI * Math.pow(5, 3); // Ideal datatype for volume of sphere is double, because it is a large number with decimals, and the formula involves PI and division, which means there will be many decimals
    private long numberOfNeurons = 1000000000L; // Ideal datatype for number of neurons is long, because it would be a very large number(for most people), and long can hold larger values than int
}

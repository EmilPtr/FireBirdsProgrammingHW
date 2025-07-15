
import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        String input = sc.nextLine().trim(); // Read user input and trim any leading or trailing whitespace
        int endP = input.length()-1;
        while (endP > 0) {
            System.out.println(input.substring(0, endP));
            endP--;
        }
        System.out.println("");
    }       
}

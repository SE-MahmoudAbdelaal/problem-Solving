/**
 * Summationfrom1toN
 */
import java.util.*;
 
public class Summationfrom1toN {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input
        int N = scanner.nextInt();
 
        // Calculate the summation using the formula
        long summation = (long) N * (N + 1) / 2;
 
        // Print the result
        System.out.println(summation);
 
        // Close the scanner
        scanner.close();
 
    }
 
}

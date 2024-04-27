import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input values
        int A = scanner.nextInt();
        char S = scanner.next().charAt(0); // Read the sign between A and B
        int B = scanner.nextInt();
        scanner.next(); // Read the '=' sign
        int C = scanner.nextInt();
 
        // Evaluate the mathematical expression based on the sign S
        int result;
        if (S == '+') {
            result = A + B;
        } else if (S == '-') {
            result = A - B;
        } else {
            result = A * B;
        }
 
        // Check if the result matches C
        if (result == C) {
            System.out.println("Yes");
        } else {
            System.out.println(result);
        }
 
        scanner.close();
    }
}
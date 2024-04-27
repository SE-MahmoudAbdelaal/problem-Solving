import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input values
        int A = scanner.nextInt();
        char S = scanner.next().charAt(0); // Read the comparison symbol
        int B = scanner.nextInt();
 
        // Compare A and B based on the comparison symbol S
        boolean isRight = false;
        if (S == '<') {
            isRight = A < B;
        } else if (S == '>') {
            isRight = A > B;
        } else if (S == '=') {
            isRight = A == B;
        }
 
        // Print the result
        if (isRight) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
 
        scanner.close();
    }
}
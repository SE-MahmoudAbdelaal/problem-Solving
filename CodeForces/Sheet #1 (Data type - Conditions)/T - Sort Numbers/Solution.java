import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three numbers
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        // Sort the numbers
        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        int mid = A + B + C - min - max;
        
        // Print sorted numbers
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        
        // Print a blank line
        System.out.println();
        
        // Print the original sequence of numbers
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        scanner.close();
    }
}
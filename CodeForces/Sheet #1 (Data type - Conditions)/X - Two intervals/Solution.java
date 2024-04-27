import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input intervals
        int l1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int r2 = scanner.nextInt();
 
        // Determine the boundaries of the intersection
        int intersectionStart = Math.max(l1, l2);
        int intersectionEnd = Math.min(r1, r2);
 
        // Check if there is an intersection
        if (intersectionStart > intersectionEnd) {
            // No intersection
            System.out.println("-1");
        } else {
            // Print the boundaries of the intersection
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
 
        scanner.close();
    }
}
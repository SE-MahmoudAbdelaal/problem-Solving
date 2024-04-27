import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
 
        if (X >= 0 && X <= 25) {
            System.out.println("Interval [0,25]");
        } else if (X > 25 && X <= 50) {
            System.out.println("Interval (25,50]");
        } else if (X > 50 && X <= 75) {
            System.out.println("Interval (50,75]");
        } else if (X > 75 && X <= 100) {
            System.out.println("Interval (75,100]");
        } else {
            System.out.println("Out of Intervals");
        }
 
        scanner.close();
    }
}
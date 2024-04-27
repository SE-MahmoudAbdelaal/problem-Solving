import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integerNumber = scan.nextInt();
        long longNumber = scan.nextLong();
        char character = scan.next().charAt(0);
        float floatNumber = scan.nextFloat();
        double doubleNumber = scan.nextDouble();
        System.out.println(
                integerNumber + "\n" + longNumber + "\n" + character + "\n" + floatNumber + "\n" + doubleNumber);
 
    }
}
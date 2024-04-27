import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long integerNumberOne = scan.nextLong();
        long integerNumberTwo = scan.nextLong();
        long integerNumberThree = scan.nextLong();
        long integerNumberFour = scan.nextLong();
        System.out
                .println("Difference = "+((integerNumberOne*integerNumberTwo)-(integerNumberThree*integerNumberFour)));
    }
}
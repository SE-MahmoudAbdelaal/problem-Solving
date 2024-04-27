import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numerator = scan.nextDouble();
        double denominator = scan.nextDouble();
        double floor, ceil, round;
        double remainder;
        double d = numerator / denominator;
 
        if (d == 1) {
            floor = 1;
            ceil = 1;
            round = 1;
        } else if (numerator % denominator == 0) {
            double devided = numerator / denominator;
            floor = devided;
            ceil = devided;
            round = devided;
        } else {
            double divided = numerator / denominator;
            double numberTocheck = ((numerator / denominator) * 10) % 10;
            floor = divided;
            ceil = divided + 1;
            if (numberTocheck < 5) {
                round = divided;
            } else {
                round = divided + 1;
            }
 
        }
        System.out.println("floor " + (int) numerator + " / " + (int) denominator + " = " + (int) floor);
        System.out.println("ceil " + (int) numerator + " / " + (int) denominator + " = " + (int) ceil);
        System.out.println("round " + (int) numerator + " / " + (int) denominator + " = " + (int) round);
 
    }
 
}
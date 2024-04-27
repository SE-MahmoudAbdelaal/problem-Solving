import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        /*
        assume price after sale is varaiable x
        assume discount precentage is varailbe y
        assume price before sale is varaiable z
        formula is 
        x - y*x = z
         */ 
        Scanner scanner=new Scanner(System.in);
        double discountPercentage=scanner.nextInt();
        double priceAfterDiscount=scanner.nextDouble();
        System.out.println(priceAfterDiscount/(1-(discountPercentage/100))); 

    }
}
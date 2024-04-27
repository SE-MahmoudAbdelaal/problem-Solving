import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long numberOne=scanner.nextLong();
        long numberTwo=scanner.nextLong();
        long numberDivisible=scanner.nextLong();

        if(numberOne%numberDivisible==0 && numberTwo%numberDivisible==0 ){
            System.out.println("Both");
        }
        else if (numberOne%numberDivisible==0 ) {
            System.out.println("Memo");
            
        }else if (numberTwo%numberDivisible==0) {
            System.out.println("Momo");

        }
        else{
            System.out.println("No One");
        }
    }
}
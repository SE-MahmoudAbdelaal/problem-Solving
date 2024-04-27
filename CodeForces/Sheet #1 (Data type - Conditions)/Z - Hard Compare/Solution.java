import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        double numberThree = scanner.nextDouble();
        double numberFour = scanner.nextDouble();
 
        if (numberTwo * Math.log(numberOne) <= numberFour * Math.log(numberThree)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
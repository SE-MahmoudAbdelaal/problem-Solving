import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String ch = Integer.toString(number);
        int first = ch.charAt(0) - '0';
        if (first  % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
 
        scanner.close();
    }
}
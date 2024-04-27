import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.print("Multiples");
 
        } else {
            System.out.print("No Multiples");
 
        }
    }
}
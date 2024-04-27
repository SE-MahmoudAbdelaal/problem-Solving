import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String f1 = scan.next();
        String s1 = scan.next();
        String f2 = scan.next();
        String s2 = scan.next();
        if (s1.equals(s2)) {
            System.out.print("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
 
    }
 
}
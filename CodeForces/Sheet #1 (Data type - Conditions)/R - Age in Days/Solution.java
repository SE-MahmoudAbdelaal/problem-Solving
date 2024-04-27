import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
 
        int years = num / 365;
        int remainingDays = num % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
 
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
 
        scanner.close();
    }
}

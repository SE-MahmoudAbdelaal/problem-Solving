import java.util.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char X = scanner.next().charAt(0);
 
        int asciiValue = (int) X;
 
        if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println("IS DIGIT");
        }
        else if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
            System.out.println("ALPHA");
            if (asciiValue >= 65 && asciiValue <= 90) {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
        scanner.close();
    }
}

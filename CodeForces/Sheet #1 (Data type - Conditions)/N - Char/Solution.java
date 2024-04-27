import java.util.*;
 
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        char capital;
        if ((int) character < 90) {
            capital = (char) ((int) character + 32);
        } else {
            capital = (char) ((int) character - 32);
 
        }
        System.out.println(capital);
        scanner.close();
    }
}
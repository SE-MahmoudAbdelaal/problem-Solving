import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String alphaBet=scanner.next();
        char charAlpha=alphaBet.charAt(0);
        if ((int)charAlpha>= (int)'z' ) {
            System.out.println('a');
            
        }else{
        System.out.println((char)((int)charAlpha+1));
        }
    }
}
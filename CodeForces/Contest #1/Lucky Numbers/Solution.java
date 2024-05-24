import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number=scanner.nextInt();
        if (Number<10) {
            System.out.println("NO");
        }else{
            int lastDigit=Number%10;
            int firstDigit=Number/10;
           if (lastDigit%firstDigit==0||firstDigit%lastDigit==0 ) {
                System.out.println("YES");
                
            }else{
                System.out.println("NO");
            }
        }

        
    }
}
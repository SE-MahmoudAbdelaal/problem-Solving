import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    long NumberOne=scanner.nextLong();
    long NumberTwo=scanner.nextLong();
    long NumberThree=scanner.nextLong();  
    if (NumberThree==0) {
        System.out.println("double");
        
    }else{
    long multipleNumbers=NumberOne*NumberTwo;
    if (multipleNumbers%NumberThree==0) {
        long result=multipleNumbers/NumberThree;
        if (result>=-2147483648&&result<=2147483647 ) {
            System.out.println("int");
            
        }else{
            System.out.println("long long");
        }
        
    }
    else{
        System.out.println("double");
    }
  }
}
}
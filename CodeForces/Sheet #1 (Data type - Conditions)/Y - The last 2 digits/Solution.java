import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long numberOne=scanner.nextLong();
        long numberTwo=scanner.nextLong();
        long numberThree=scanner.nextLong();
        long numberFour=scanner.nextLong();
        long moduleNumberOne=numberOne%100;
        long moduleNumberTwo=numberTwo%100;
        long moduleNumberThree=numberThree%100;
        long moduleNumberFour=numberFour%100;
 
        long multiplication=moduleNumberOne*moduleNumberTwo*moduleNumberThree*moduleNumberFour;
        if (multiplication%100<9){
            System.out.printf("%02d\n", multiplication%100);
        }else if(multiplication%100==0){
            System.out.printf("%02d\n", 0);
        }
        else {
            System.out.println(multiplication%100);
        }
 
    }
}
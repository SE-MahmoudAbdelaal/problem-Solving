import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eyeNumber=scanner.nextInt();
        int mouthNumber=scanner.nextInt();
        int bodyNumber=scanner.nextInt();
        int souvenirsNumber=0; 
        int souvenirsNumber1=Math.min(eyeNumber, mouthNumber);
        int souvenirsNumber2=Math.min(eyeNumber, mouthNumber);
        souvenirsNumber=Math.min(souvenirsNumber1, souvenirsNumber2);//24
        eyeNumber-=souvenirsNumber;//66
        mouthNumber-=souvenirsNumber;//0
        bodyNumber-=souvenirsNumber;//65
            souvenirsNumber+=eyeNumber/2;
            eyeNumber-=eyeNumber/2;
            bodyNumber-=eyeNumber/2;
        System.out.println(souvenirsNumber);



        

        
    }
} 
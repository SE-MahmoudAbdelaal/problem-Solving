
import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        String numStr = Double.toString(num);
        String parts[] = numStr.split("\\.");
        parts[1] = "0." + Integer.parseInt(parts[1]);
        double actualArray[] = new double[2];
        actualArray[0] = Double.parseDouble(parts[0]);
        actualArray[1] = Double.parseDouble(parts[1]);
 
        if (actualArray[1] == 0) {
            System.out.println("int " + (int) num);
 
        } else {
            System.out.println("float " + (int) actualArray[0] + " " + actualArray[1]);
        }
 
        scanner.close();
    }
}
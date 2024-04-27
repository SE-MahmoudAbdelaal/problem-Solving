import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] parts = input.split("[-+*/]");
 
        int numberOne = Integer.parseInt(parts[0]);
        char mathematicalExpression = input.charAt(parts[0].length());
        int numberTwo = Integer.parseInt(parts[1]);
 
        int result = 0;
        switch (mathematicalExpression) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
 
        // Print the result
        System.out.println(result);
 
        scanner.close();
    }
}
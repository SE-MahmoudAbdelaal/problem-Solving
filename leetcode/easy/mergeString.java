import java.util.*;

public class mergeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word1: ");
        String word1 = scanner.nextLine();
        char[] arrayWord1 = word1.toCharArray();

        System.out.print("Enter word2: ");
        String word2 = scanner.nextLine();
        char[] arrayWord2 = word2.toCharArray();

        int totalLength = word1.length() + word2.length();
        char[] finalArray = new char[totalLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrayWord1.length && j < arrayWord2.length) {
            finalArray[k++] = arrayWord1[i++];
            finalArray[k++] = arrayWord2[j++];
        }

        // Add remaining characters from word1
        while (i < arrayWord1.length) {
            finalArray[k++] = arrayWord1[i++];
        }

        // Add remaining characters from word2
        while (j < arrayWord2.length) {
            finalArray[k++] = arrayWord2[j++];
        }

        System.out.println("Merged string: " + new String(finalArray));
    }
}

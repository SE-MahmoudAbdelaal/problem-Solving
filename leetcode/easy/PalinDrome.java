public class PalinDrome {
    public static boolean isPalindrome(int number) {

    if (number < 0)
        return false;

    int originalNumber = number;
    int reversed = 0;

    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }

    return originalNumber == reversed;
}
}
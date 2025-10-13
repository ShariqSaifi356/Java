public class SpyNumber {
    public static void main(String[] args) {
        // A spy number is a positive number where the sum of its digits is equal to the
        // product of its digits.

        int number = 1124;
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            number = number / 10;
        }
        if (sum == product) {
            System.out.println("The given number is a Spy number.");
        } else {
            System.out.println("The given number is not a Spy number.");
        }
    }
}

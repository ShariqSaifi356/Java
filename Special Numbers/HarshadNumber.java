public class HarshadNumber {
    public static void main(String[] args) {
        // A Harshad number is a number that is divisible by the sum of its digits.
        // Example 1: 18
        // Digits → 1 and 8
        // Sum of digits → 1 + 8 = 9
        // Now check divisibility:
        // 18 ÷ 9 = 2
        // 18÷9=2 → perfectly divisible
        // So 18 is a Harshad number.

        int number = 21;
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println("The given number is a Harshad Number.");
        } else {
            System.out.println("The given number is not a Harshad Number.");
        }
    }
}

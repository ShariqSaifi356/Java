public class NeonNumber {
    public static void main(String[] args) {
        // A neon number is a positive integer where the sum of the digits of its square
        // is equal to the original number itself.
        // For example : 9^2 = 81 => 8+1 = 9.

        int number = 14;
        int square = (int) Math.pow(number, 2);
        int sum = 0;

        while (square != 0) {
            int lastDigit = square % 10;
            sum = sum + lastDigit;
            square = square / 10;
        }
        if (number == sum) {
            System.out.println("The given number is a Neon number.");
        } else {
            System.out.println("The given number is not a Neon number.");
        }
    }
}

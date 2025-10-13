public class AutomorphicNumber {
    public static void main(String[] args) {
        // An automorphic number is a number whose square ends in the same digits as the
        // number itself.
        // Examples: n = 25:
        // n square = 625
        // Last two digits of 625 are 25, so 25 is automorphic.

        int number = 625;
        int count = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        int squareOfNumber = (int) Math.pow(number, 2);

        int lastDigitOfNumber = squareOfNumber % (int) Math.pow(10, count);

        if (lastDigitOfNumber == number) {
            System.out.println("The given number is an Automorphic Number.");
        } else {
            System.out.println("The given number is not an Automorphic Number.");
        }

    }
}

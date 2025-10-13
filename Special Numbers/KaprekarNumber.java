public class KaprekarNumber {
    public static void main(String[] args) {
        // When you square a number to check if it’s a Kaprekar number, you have to
        // split the square into two parts — a left part and a right part.

        int number = 45;
        int square = (int) Math.pow(number, 2);
        int sum = 0;
        int temp = number;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int rightPartOfNumber = square % (int) Math.pow(10, count);
        int leftPartOfNumber = square / (int) Math.pow(10, count);
        sum = leftPartOfNumber + rightPartOfNumber;

        if (sum == number) {
            System.out.println("The given number is a Kapreker Number.");
        } else {
            System.out.println("The given number is not a Kapreker Number.");
        }
    }
}

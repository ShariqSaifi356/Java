public class MagicNumber {
    public static void main(String[] args) {

        // //A Magic Number is a number in which the sum of its digits is repeatedly
        // calculated until a single digit is obtained,
        // and if that single digit is 1, then the number is called a Magic Number.

        int number = 1729;
        int sum = number;

        while (sum > 9) {
            int temp = sum;
            sum = 0;

            while (temp != 0) {
                int lastDigit = temp % 10;
                sum = sum + lastDigit;
                temp = temp / 10;
            }
        }

        if (sum == 1) {
            System.out.println("The given number is a Magic number.");
        } else {
            System.out.println("The given number is not a Magic number.");
        }
    }
}

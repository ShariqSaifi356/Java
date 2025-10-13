public class ArmstrongNumber {
    public static void main(String[] args) {
        // What an Armstrong number means
        // An Armstrong number (also called a narcissistic number) is a number that is
        // equal to the sum of its own digits,
        // each raised to the power of the number of digits.
        // Take 9474
        // (9⁴) + (4⁴) + (7⁴) + (4⁴)
        // = 6561 + 256 + 2401 + 256
        // = 9474
        int number = 548834;
        int armstrongNumber = number;
        int sum = 0;
        int countDigits = 0;

        //Count number of digits
        int count = number;
        while (count != 0) {
            count = count / 10;
            countDigits++;
        }
        // Calculate sum of each digit raised to the power of total digits
        while (number != 0) {

            int lastDigit = number % 10;
            // Math.pow returns double so converting it into int.
            int power = (int) Math.pow(lastDigit, countDigits);
            sum = sum + power;
            number = number / 10;
        }
        if (armstrongNumber == sum) {
            System.out.println("The given number is a Armstrong number : " + armstrongNumber);
        } else {
            System.out.println("The given number is not a Armstrong number : " + armstrongNumber);
        }

    }
}

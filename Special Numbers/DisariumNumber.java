public class DisariumNumber {
    public static void main(String[] args) {
        // A Disarium number is a number in which the sum of its digits powered with
        // their respective positions is equal to the number itself.

        int number = 135;
        int count = 0;
        int tempNumber1 = number;
        int tempNumber2 = number;
        int sum = 0;

        while (tempNumber1 != 0) {
            tempNumber1 = tempNumber1 / 10;
            count++;
        }

        while (tempNumber2 != 0) {
            int lastDigit = tempNumber2 % 10;
            sum = sum + (int) Math.pow(lastDigit, count);
            count--;
            tempNumber2 = tempNumber2 / 10;
        }

        if (sum == number) {
            System.out.println("The given number is a Disarium number.");
        } else {
            System.out.println("The given number is not a Disarium number.");
        }

    }
}

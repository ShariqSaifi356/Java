public class SumOfEvenDigits {
    public static void main(String[] args) {
        int number = 23214;
        // 2 + 2 + 4 = 8
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }
            number /= 10;
        }
        System.out.println("The sum of even digits in a number is : " + sum);
    }
}

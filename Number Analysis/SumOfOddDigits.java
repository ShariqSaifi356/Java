public class SumOfOddDigits {
    public static void main(String[] args) {
        int number = 23214;
        // 3 + 1 = 4
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                sum = sum + lastDigit;
            }
            number /= 10;
        }
        System.out.println("The sum of odd digits in a number is : " + sum);
    }
}

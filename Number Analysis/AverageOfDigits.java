public class AverageOfDigits {
    public static void main(String[] args) {
        int number = 2121;
        int count = 0;
        int sum = 0;
        number = Math.abs(number);

        while (number!=0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            count++;
            number = number / 10;
        }

        double average = (double)sum / count;
        System.out.println(average);
    }
}

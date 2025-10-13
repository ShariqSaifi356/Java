public class FactorialOfNumber {
    public static void main(String[] args) {

        int number = 5;
        int factorialOfNumber = 1;

        if (number == 0) {
            System.out.println("Factorial of a given number is : " + 0);
        } else {
            for (int i = 1; i <= number; i++) {

                factorialOfNumber = factorialOfNumber * i;
            }

            System.out.println("Factorial of a given number is : " + factorialOfNumber);
        }

    }
}

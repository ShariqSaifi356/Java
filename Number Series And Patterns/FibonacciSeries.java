public class FibonacciSeries {
    public static void main(String[] args) {

        // The Fibonacci Series is a famous mathematical sequence where each number is
        // the sum of the two numbers before it.
        int number = 10;
        int num_1 = 0;
        int num_2 = 1;
        int fibonacci = 0;

        System.out.print(num_1 + " " + num_2 + " ");
        for (int i = 3; i <= number; i++) {
            fibonacci = num_1 + num_2;
            num_1 = num_2;
            num_2 = fibonacci;
            System.out.print(fibonacci + " ");
        }
    }

}

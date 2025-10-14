public class TribonacciSeries {
    public static void main(String[] args) {
        // The Tribonacci Series is an extension of the Fibonacci Series, but instead of
        // adding the previous two numbers, you add the previous three numbers to get
        // the next term.

        int number = 10;
        int num_1 = 0;
        int num_2 = 1;
        int num_3 = 1;
        int tribonacci = 0;

        System.out.print(num_1 + " " + num_2 + " " + num_3 + " ");
        for(int i=4;i<=number;i++){
            tribonacci = num_1 + num_2 + num_3;
            num_1 = num_2;
            num_2 = num_3;
            num_3 = tribonacci;
            System.out.print(tribonacci + " ");
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 10079;
        int flag = 2;

        if (number <= 1) {
            System.out.println("Neither Prime Nor Composite number.");
            return;
        }
        while (flag < Math.sqrt(number)) {
            if (number % flag == 0) {
                System.out.println("Not a prime number.");
                return;
            }
            flag++;
        }
        System.out.println("The given number is a Prime number : " + number);

    }
}

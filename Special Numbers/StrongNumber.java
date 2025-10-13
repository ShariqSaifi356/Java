public class StrongNumber {
    public static void main(String[] args) {
        // A Strong number is a number in which the sum of the factorial of its digits
        // is equal to the number itself.
        // Example: 145 → 1! + 4! + 5! = 1 + 24 + 120 = 145

        int number = 145;
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for(int i=1; i<= lastDigit; i++){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
        }
        if (sum == originalNumber) {
            System.out.println("The given number is a Strong Number.");
        }
        else{
            System.out.println("The given number is not a Strong Number.");
        }
    }
}

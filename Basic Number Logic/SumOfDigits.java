public class SumOfDigits {
    public static void main(String[] args) {
        
        // Input : 1234
        // Output : 1 + 2 + 3 + 4 = 10

        int number = 1234;
        int sumOfDigits = 0;
        // If the number is negative then in case use Maths.abs() method to positive the number.
        while (number != 0) {
            
            int lastdigit = number % 10;
            sumOfDigits = sumOfDigits + lastdigit;
            number = number / 10;
        }

        System.out.println("The sum of digits is : " + sumOfDigits);

    }
    
}

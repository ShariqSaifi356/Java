public class ProductOfDigits {
    public static void main(String[] args) {
        int number = 234;
        // Output : 2 * 3 * 4 = 24
        int product = 1;
        
        while (number != 0) {
            int lastDigit = number % 10;
            product = product * lastDigit;
            number = number / 10;
        }
        System.out.println(product);
    }
}

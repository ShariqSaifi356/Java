public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int originalNumber = number;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("There are \"" + count + "\" digits in a number : " + originalNumber);
    }
}

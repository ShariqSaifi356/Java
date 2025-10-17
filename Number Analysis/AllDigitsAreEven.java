public class AllDigitsAreEven {
    public static void main(String[] args) {
        int number = 22221;
        boolean isEven = true;

        while (number!=0) {
            int lastDigit = number % 10;
            if (lastDigit%2 !=0) {
                isEven = false;
                break;
            }
            number /= 10;
        }
        if (isEven) {
            System.out.println("All digits in a number are Even.");
        }
        else{
            System.out.println("All digits in a number are not Even.");
        }
    }
}

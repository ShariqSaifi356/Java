public class AllDigitsAreOdd {
    public static void main(String[] args) {
        int number = 11121;
        boolean isEven = true;

        while (number!=0) {
            int lastDigit = number % 10;
            if (lastDigit%2 ==0) {
                isEven = false;
                break;
            }
            number /= 10;
        }
        if (isEven) {
            System.out.println("All digits in a number are ODD.");
        }
        else{
            System.out.println("All digits in a number are not ODD.");
        }
    }
}

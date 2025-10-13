public class ReverseNumber {
    
    public static void main(String[] args) {

        // input : 123
        int number = 123456789;
        // output : 321;

        int reversedNumber = 0;

        while (number != 0) {

            int lastDigitOfNumber = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigitOfNumber;
            number = number / 10;            
        }

        System.out.println("Reversed number is : " + reversedNumber);

    }

}

public class NumberPalindrome {
    public static void main(String[] args) {
        
        int number = 121;
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number / 10;
        }

        if (originalNumber == reversedNumber){
            System.out.println("The given number is a Palindrome number : " + originalNumber);
        }
        else {
            System.out.println("The given number is not a Palindrome number.");
        }

    }
}

public class SwapTwoNumber {
    public static void main(String[] args) {
        
        int firstNumber = 5, secondNumber = 9;

    // Swap two numbers without using third variable.

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After swap first number is: " + firstNumber);
        System.out.println("After swap second number is: " + secondNumber);

    }
}

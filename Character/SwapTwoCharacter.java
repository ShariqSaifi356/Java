public class SwapTwoCharacter {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'c';

        int num1 = ch1;
        int num2 = ch2;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: ch1 = " + (char)num1 + ", ch2 = " + (char)num2);
    }
}

public class CharacterIsDigit {
    public static void main(String[] args) {
        char ch = '5';

        if (ch >= '0' && ch <= '9') {
            System.out.println("Its a Digit");
        }
        else{
            System.out.println("Is not a Digit.");
        }
    }
}
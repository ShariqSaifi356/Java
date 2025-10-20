public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        char ch = 'x';

        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
            System.out.println(ch);
        } else {
            System.out.println("Already uppercase or not a letter.");
        }
    }
}

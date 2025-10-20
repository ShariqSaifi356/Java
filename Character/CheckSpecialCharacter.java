public class CheckSpecialCharacter {
    public static void main(String[] args) {
        char ch = '#';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is not a special character.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}

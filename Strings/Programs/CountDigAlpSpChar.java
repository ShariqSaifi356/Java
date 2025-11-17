public class CountDigAlpSpChar {
    public static void main(String[] args) {
        String str = "#Apple0123#";

        int countDigits = 0;
        int countAlphabets = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Digits
            if (ch >= '0' && ch <= '9') {
                countDigits++;
            }
            // Alphabets
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                countAlphabets++;
            }
            // Special characters
            else {
                countSpecialChar++;
            }
        }

        System.out.println("Digits: " + countDigits);
        System.out.println("Alphabets: " + countAlphabets);
        System.out.println("Special Characters: " + countSpecialChar);
    }
}

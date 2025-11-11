public class Compare2StringsIgnoreCase {
    public static void main(String[] args) {
        String strOne = "HELLO";
        String strTwo = "hello";
        // System.out.println(compareTwoStrings(strOne, strTwo));
        System.out.println(compareTwoStringsIgnoreCase(strOne, strTwo));
    }

    public static boolean compareTwoStrings(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        } else {
            for (int i = 0; i < strOne.length(); i++) {
                if (strOne.charAt(i) != strTwo.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    // Compare two strings (ignoring case).
    public static boolean compareTwoStringsIgnoreCase(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        } else {
            for (int i = 0; i < strOne.length(); i++) {
                char ch1 = strOne.charAt(i);
                char ch2 = strTwo.charAt(i);

                // Convert both to lowercase manually
                if (ch1 >= 'A' && ch1 <= 'Z') {
                    ch1 = (char) (ch1 + 32);
                }
                if (ch2 >= 'A' && ch2 <= 'Z') {
                    ch2 = (char) (ch2 + 32);
                }

                if (ch1 != ch2) {
                    return false;
                }
            }
        }
        return true;
    }
}

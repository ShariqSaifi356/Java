public class Palindrome {
    public static void main(String[] args) {
        // Return true if array is palindrome.

        String str = "abcba";
        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String str) {
        str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            // Two pointers Approach
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end)
                return false;
        }
        return true;
    }
}

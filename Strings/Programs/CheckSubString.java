public class CheckSubString {
    public static void main(String[] args) {
        // Get a substring from a string.
        String str = "programming";
        int start = 3;
        int end = 7;

        if (start < 0 || end > str.length() || start > end) {
            System.out.println("Invalid start or end index.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }

        System.out.println("Substring: " + sb.toString());
    }
}

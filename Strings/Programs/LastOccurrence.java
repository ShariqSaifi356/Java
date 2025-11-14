public class LastOccurrence {
    public static void main(String[] args) {
        // Find the last occurrence of a character in a string.

        String str = "elephant";
        char target = 'e';
        int lastIndex = -1;

        if (str == null || str.length() == 0) {
            System.out.println("Target not found.");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                lastIndex = i; // overwrite each time we find target
            }
        }

        if (lastIndex == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Last occurrence at index: " + lastIndex);
        }
    }
}

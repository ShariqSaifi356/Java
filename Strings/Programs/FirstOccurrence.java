public class FirstOccurrence {
    public static void main(String[] args) {
        // Find the first occurrence of a character in a string.

        String str = "elephant";
        char target = 'z';
        int index = -1;
        if (str == null || str.length() == 0) {
            System.out.println("Target not found.");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char chString = str.charAt(i);
            if (chString == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("The index of target in the string is: " + index);
        }
    }
}

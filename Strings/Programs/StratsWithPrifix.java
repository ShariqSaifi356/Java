public class StratsWithPrifix {
    public static void main(String[] args) {
        // Check if a string starts with a given prefix.
        String str = "programming";
        str = str.toLowerCase(); // assign back to apply lowercase
        String prefix = "pro";
        boolean found = true;
        if (str == null || str.length() == 0) {
            System.out.println("Prefix is not present in a string.");
            return;
        }
        if (prefix.length() > str.length()) {
            System.out.println("Prefix is longer than the string.");
            return;
        }
        for (int i = 0; i < prefix.length(); i++) {
            char chStr = str.charAt(i);
            char chPrefix = prefix.charAt(i);
            if (chStr != chPrefix) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Prefix is present in a string.");
        } else {
            System.out.println("Prefix is not present in a string.");
        }
    }
}

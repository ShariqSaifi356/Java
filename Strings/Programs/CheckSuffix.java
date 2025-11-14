public class CheckSuffix {
    public static void main(String[] args) {
        String str = "readable";
        String suffix = "able";
        boolean found = true;
        if (str == null || str.length() == 0 || suffix.length() > str.length()) {
            System.out.println("No, suffix is not present in the string.");
            return;
        }

        int startIndex = str.length() - suffix.length(); // where the suffix should start

        for (int i = 0; i < suffix.length(); i++) {
            if (str.charAt(startIndex + i) != suffix.charAt(i)) {
                found = false;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, suffix is present in the string.");
        } else {
            System.out.println("No, suffix is not present in the string.");
        }
    }
}

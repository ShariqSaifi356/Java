public class Compare2Strings {
    public static void main(String[] args) {
        String strOne = "Hello";
        String strTwo = "Hello";
        boolean isEqual = true;
        for (int i = 0, j = 0; i < strOne.length(); i++, j++) {
            char chOne = strOne.charAt(i);
            char chTwo = strTwo.charAt(j);

            if (chOne != chTwo) {
                isEqual = false;
            }
        }
        if (isEqual) {
            System.out.println("Both Strings are same.");
        } else {
            System.out.println("Both Strings are not same.");
        }
    }

    public static void optimizedVersion() {
        String strOne = "Hello";
        String strTwo = "Hello";
        boolean isEqual = true;

        // Check if lengths are same first
        if (strOne.length() != strTwo.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < strOne.length(); i++) {
                if (strOne.charAt(i) != strTwo.charAt(i)) {
                    isEqual = false;
                    break; // no need to continue once mismatch found
                }
            }
        }

        if (isEqual) {
            System.out.println("Both Strings are same.");
        } else {
            System.out.println("Both Strings are not same.");
        }

    }
}

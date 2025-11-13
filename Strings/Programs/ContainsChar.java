public class ContainsChar {
    public static void main(String[] args) {
        // Check if a string contains a particular character.
        String str = "Zeeshan";
        char target = 's';
        if (str == null || str.length() == 0) {
            System.out.println("No, traget is not present in str.");
            return;
        }
        boolean found = false; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, target is present in str.");
        } else {
            System.out.println("No, target is not present in str.");
        }
    }

}

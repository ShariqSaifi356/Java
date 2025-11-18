public class CountFrequencyOfChar {
    public static void main(String[] args) {
        // Count the frequency of each character.

        String str = "banana";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            // skip if this character already appeared before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // skip duplicate character
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println("Frequency of " + str.charAt(i) + " is: " + count);
        }
    }

}

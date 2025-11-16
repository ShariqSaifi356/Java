public class ReplaceAlloccurrences {
    public static void main(String[] args) {
        // Replace all occurrences of a character in a string.
        String str = "banana";
        char replaceCharacter = 'a';
        char replaceCharacterWith = 'x';
        StringBuilder sb = new StringBuilder();
        if (str == null || str.length() == 0) {
            System.out.println("Invalid");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == replaceCharacter) {
                sb.append(replaceCharacterWith);
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

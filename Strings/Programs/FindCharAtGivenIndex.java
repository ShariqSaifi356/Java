public class FindCharAtGivenIndex {
    public static void main(String[] args) {
        // Write a Java program to get the character at the given index within the string.
        String str = "Java Exercises!";
        int position = 6;
        if (position < 0 || position >= str.length()) {
            System.out.println("Not a valid position");
        } else {
            System.out.println("Character at position " + position + ": " + str.charAt(position));
        }
    }
}

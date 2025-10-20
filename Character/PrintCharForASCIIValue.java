public class PrintCharForASCIIValue {
    public static void main(String[] args) {
        int ASCIIValue = 65;
        // Yes need of typeCasting because we are converting larger datatype into smaller datatype.
        char ch = (char)ASCIIValue;
        System.out.println(ch);
    }
}

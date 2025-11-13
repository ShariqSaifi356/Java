public class CheckStringIsEmpty {
    public static void main(String[] args) {
        // Check if a string is empty.
        String str = "";
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty.");
        }else{
            System.out.println("String is not empty.");
        }
    }
}

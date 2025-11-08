public class FindLength {
    public static void main(String[] args) {
        // Find the length of a string.
        String str = "AkashKumarYadav";
        // method one
        // System.out.println(str.length());
        char[] strArr = str.toCharArray();
        System.out.println(strArr.length);
        // int count = 0;
        // for (int i = 0; i < strArr.length; i++) {
        //     count++;
        // }
        // System.out.println(count);
    }
}

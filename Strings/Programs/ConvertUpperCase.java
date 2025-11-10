public class ConvertUpperCase {
    public static void main(String[] args) {
        String str = "akash kumar yadav";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char upperCase = (char) (c - 32);
                sb.append(upperCase);
            } else {
                sb.append(c);
            }
        }
        String upperCaseString = sb.toString();
        System.out.println(upperCaseString);
    }
}

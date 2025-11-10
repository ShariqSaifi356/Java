public class ConvertLowerCase {
    public static void main(String[] args) {
        String str = "AKASH KUMAR YADAV";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char lowerCase = (char) (c + 32);
                sb.append(lowerCase);
            } else {
                sb.append(c);
            }
        }

        String lowerCaseString = sb.toString();
        System.out.println(lowerCaseString);
    }
}

public class Concatenate2Strings {
    public static void main(String[] args) {
        String str1 = "Akash";
        String str2 = "Yadav";
        // Concatenation using + operator
        // System.out.println(str1+str2);
        System.out.println(usingLoop(str1, str2));
    }

    public static String usingLoop(String str1, String str2){

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            sb.append(ch);
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            sb.append(ch);
        }
        String concatenation = sb.toString();
        return concatenation;
    }
}

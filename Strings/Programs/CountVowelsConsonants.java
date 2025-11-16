public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Count vowels and consonants in a string.
        String str = "Equation";
        str = str.toLowerCase();
        int countVowels = 0;
        int countConsonants = 0;

        if (str == null || str.length() == 0) {
            System.out.println("Invalid");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            }else{
                countConsonants++;
            }
        }
        System.out.println("Vowels in a String are : "+ countVowels);
        System.out.println("Consonants in a String are : "+ countConsonants);

    }
}

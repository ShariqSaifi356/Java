public class LCM {
    public static void main(String[] args) {

        // Formula : LCM = (number 1 * number2)/HCF

        int num1 = 20, num2 = 28;
        int temp = Math.min(num1, num2);
        int HCF = 0;

        while (temp != 0) {
            if (num1 % temp == 0 && num2 % temp == 0) {
                HCF = temp;
                break;
            }
            temp--;
        }
        int LCM = (num1 * num2) / HCF;
        System.out.println("LCM is : " + LCM);
    }
}

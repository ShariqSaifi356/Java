public class HCF {
    public static void main(String[] args) {
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
        System.out.println("HCF is : " + HCF);
    }
}

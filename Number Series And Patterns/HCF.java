public class HCF {
    public static void main(String[] args) {
        int num1 = 20, num2 = 28;
        // The HCF can never be greater than the smaller number.
        // For Example : The largest number that divides 20 and 28 can’t be more than
        // 20, because 20 itself doesn’t divide 28 completely.
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

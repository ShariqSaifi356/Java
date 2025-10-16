public class ArmstorngNumberRange {
    public static void main(String[] args) {
        int range = 1000;

        for (int i = 1; i <= range; i++) {
            int sum = 0;
            int count = 0;
            int tempNumber = i;
            int originalNumnber = i;
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
            tempNumber = i;
            while (tempNumber != 0) {
                int lastDigit = tempNumber % 10;
                sum = sum + (int) Math.pow(lastDigit, count);
                tempNumber = tempNumber / 10;
            }
            if (sum == originalNumnber) {
                System.out.print(originalNumnber + " ");
            }
        }
    }
}

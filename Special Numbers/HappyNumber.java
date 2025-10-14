import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        // A Happy Number is a number that eventually becomes 1 when you repeatedly
        // replace the number with the sum of the squares of its digits.

        int number = 19;
        int sum = number;
        Set<Integer> seen = new HashSet<>(); // to track repeated sums

        while (sum != 1 && !seen.contains(sum)) {
            seen.add(sum);
            int temp = sum;
            sum = 0;

            while (temp != 0) {
                int lastDigit = temp % 10;
                sum = sum + (int) Math.pow(lastDigit, 2);
                temp = temp / 10;
            }
        }
        if (sum == 1) {
            System.out.println("The given number is a Happy Number.");
        } else {
            System.out.println("The given number is not a Happy Number.");
        }
    }
}

public class RemoveDuplicateDigits {
    public static void main(String[] args) {
        int num = 1223345; // Example input
        int result = 0;
        int checker = 0;

        // Step 1: Remove duplicates (while preserving order in reverse)
        while (num != 0) {
            int digit = num % 10;         // get last digit
            int mask = 1 << digit;        // create a unique bit for each digit

            // If this digit hasn't appeared yet
            if ((checker & mask) == 0) {
                checker |= mask;           // mark it as seen
                result = result * 10 + digit; // add to result
            }

            num /= 10;                     // move to next digit
        }

        // Step 2: Reverse result to correct the order
        int finalResult = 0;
        while (result != 0) {
            int digit = result % 10;
            finalResult = finalResult * 10 + digit;
            result /= 10;
        }

        System.out.println("Number after removing duplicates: " + finalResult);
    }
}

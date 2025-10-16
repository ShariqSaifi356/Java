public class PrimeNumberRange {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            int flag = 2;
            boolean isPrime = true;
            while (flag <= Math.sqrt(i)) {
                if (i % flag == 0) {
                    isPrime = false;
                    break;
                }
                flag++;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

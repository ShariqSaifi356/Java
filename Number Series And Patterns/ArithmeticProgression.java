public class ArithmeticProgression {
    public static void main(String[] args) {
        int n = 10; // number of terms
        int a = 2; // first number
        int d = 3;// difference
        for (int i = 1; i <= n; i++) {
            int AP = a + (i - 1) * d;
            System.out.print(AP + " ");
        }

    }
}

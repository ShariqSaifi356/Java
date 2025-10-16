public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j);
            }
            System.out.println();
        }
    }
}

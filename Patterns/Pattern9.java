public class Pattern9 {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {

            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            for (int col = 2 * (num - row) + 1; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

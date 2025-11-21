public class pattern8 {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {

            for (int space = num - row; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

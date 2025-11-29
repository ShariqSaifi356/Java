public class Pattern15 {
    public static void main(String[] args) {
        int num = 5;

        // TOP PART
        for (int row = 1; row <= num; row++) {

            // leading spaces
            for (int space = 1; space <= num - row; space++) {
                System.out.print(" ");
            }

            // hollow logic
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // BOTTOM PART
        for (int row = num - 1; row >= 1; row--) {

            // leading spaces
            for (int space = 1; space <= num - row; space++) {
                System.out.print(" ");
            }

            // hollow logic
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

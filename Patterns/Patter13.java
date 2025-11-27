public class Patter13 {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {

            for (int space = num; space > row; space--) {
                System.out.print("_");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                // First and last line.
                if (row == 1 || row == num) {
                    System.out.print("*");
                } else {
                    if (col == 1 || col == 2 * row - 1) {
                        System.out.print("*");
                    }else{
                        System.out.print("_");
                    }
                }
            }
            System.out.println();
        }
    }
}

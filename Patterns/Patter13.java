public class Patter13 {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {

            for (int space = num; space > row; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern16 {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 0; row < num; row++) {
            for (int space = 1; space <= num - row; space++) {
                System.out.print(" ");
            }

            int value = 1;

            for (int col = 0; col <= row; col++) {
                
                System.out.print(value + " ");
                 value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}

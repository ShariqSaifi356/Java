public class pattern14 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (num - i) + 1; j++) {
                if (i == 1 || i == num) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 2 * (num - i) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // System.out.print("*");
            }
            System.out.println();
        }
    }
}

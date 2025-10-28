public class SumOfMatrices {
    public static void main(String[] args) {
        int[][] matriceOne = {
                { 1, 2, 1 },
                { 2, 1, 3 },
                { 3, 2, 1 }
        };
        int[][] matriceTwo = {
                { 2, 1, 2 },
                { 3, 2, 1 },
                { 1, 3, 2 }
        };
        int[][] sum = new int[matriceOne.length][matriceOne[0].length];

        for (int i = 0; i < matriceOne.length; i++) {
            for (int j = 0; j < matriceOne[i].length; j++) {
                sum[i][j] = matriceOne[i][j] + matriceTwo[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

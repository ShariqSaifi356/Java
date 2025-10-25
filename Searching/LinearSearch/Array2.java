package LinearSearch;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 5 },
                { 6, 11, 9 },
                { 16, 21, 7 }
        };
        int target = 11;
        // System.out.println(arr.length);
        int[] result = linearSearchIn2DArray(arr, target);
        System.out.println(Arrays.toString(result));
        System.out.println(max(arr));
        System.out.println(countEvenDigitsIn2DArray(arr));
    }

    public static int[] linearSearchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    public static int countEvenDigitsIn2DArray(int[][] arr){
        int coutEven = 0;
        for(int row =0;row<arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                int element = arr[row][col];
                int count = 0;
                while (element!=0) {
                    element = element/10;
                    count++;
                }
                if (count%2==0) {
                    coutEven++;
                }
            }
        }
        return coutEven;
    }
}

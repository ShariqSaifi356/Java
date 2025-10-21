import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // declareArray(input);
        int[] arr = { 23, 12, 31, 21, 60 };
        System.out.println(maxElement(arr));
        System.out.println(inRangeMax(arr, 1, 3));
    }

    static void declareArray(Scanner input) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Printing Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static int maxElement(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int inRangeMax(int[] arr, int start, int end) { 
        //The range is invalid — the starting index comes after the ending index.
        if (start > end) {
            return -1;
        }
        //The array reference doesn’t point to any actual array in memory.
        if (arr == null) {
            return -1;
        }
        
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
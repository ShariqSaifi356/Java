import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(Arrays.toString(reverseArray(arr)));
        System.out.println(Arrays.toString(reversingArrayUsing2Pointers(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }

    public static int[] reversingArrayUsing2Pointers(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;

            start++;
            end--;
        }

        return arr;
    }
}

import java.util.Arrays;

public class MoveAll0sToEnd {
    public static void main(String[] args) {
        // Write a Java program to move all 0's to the end of an array. Maintain the
        // relative order of the other (non-zero) array elements.

        int[] arr = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int swap = arr[index];
                arr[index] = arr[i];
                arr[i] = swap;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

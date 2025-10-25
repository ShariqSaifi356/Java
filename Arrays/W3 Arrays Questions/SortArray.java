import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Write a Java program to sort a numeric array.
        int[] arr = { 4, 3, 1, 6, 2 };
        for (int i = 0; i < arr.length; i++) {            
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = { 20, 20, 30, 40, 50, 50, 50 };
        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            // Skip duplicates: only add if it's the last element or different from the next
            // one
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(newArr, j)));
        System.out.println("New length: " + j);
    }
}

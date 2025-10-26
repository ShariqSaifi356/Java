import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 10, 11, 21, 22 };
        int[] temp = new int[arr.length];
        int newLength = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if arr[i] is already present in temp
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, add it to temp
            if (!isDuplicate) {
                temp[newLength++] = arr[i];
            }
        }

        // Create final array with correct length
        int[] result = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            result[i] = temp[i];
        }

        System.out.println(Arrays.toString(result));
    }
}

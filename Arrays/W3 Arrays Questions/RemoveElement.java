import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = { 21, 34, 67, 78, 90 };
        int target = 78;
        int index = -1;
        int[] afterDel = new int[arr.length - 1];
        // Finding the index of an target element.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
            return;
        }

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue; // skip the target element
            afterDel[j++] = arr[i];
        }

        System.err.println(Arrays.toString(afterDel));

    }
}

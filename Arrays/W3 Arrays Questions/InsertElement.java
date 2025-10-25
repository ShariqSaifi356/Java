import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = { 32, 12, 56, 78, 21 };
        // Insert 7 at position 2
        int newElement = 7;
        int index = 2;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = newElement;
            } else {
                newArr[i] = arr[j++];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}

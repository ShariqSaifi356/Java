import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = { 11, 21, 31, 41, 51 };
        arrayToArrayList(arr);

    }

    public static void arrayToArrayList(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        System.out.println(arrList);
    }

    public static void arrayListToArray() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}

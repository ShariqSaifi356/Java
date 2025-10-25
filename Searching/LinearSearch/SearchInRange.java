package LinearSearch;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 23, 54, 56, 67, 32, 12, 78, 12 };

        System.out.println(searchElementInRange(arr, 1, 5, 67)); // index
        System.out.println(searchMinsElementInRange(arr, 1, 5)); // min
        System.out.println(searchMaxsElementInRange(arr, 1, 5)); // max
    }

    public static int searchElementInRange(int[] arr, int start, int end, int target) {
        if (arr == null || arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) { // inclusive range
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchMinsElementInRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int searchMaxsElementInRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

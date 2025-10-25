package LinearSearch;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 23, 54, 56, 67, 32, 45, 78, 12 };
        int target = 67;
        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearch2(arr, target));
        System.out.println(linearSearch3(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        // arr.length == 0 --> It means array exists with no element(zero element)
        // arr == null --> It means array is not define, it will NullPointerException.
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // If target not found in the array.
    }

    // Search the target and return the element.
    public static int linearSearch2(int[] arr, int target) {
        // arr.length == 0 --> It means array exists with no element(zero element)
        // arr == null --> It means array is not define, it will NullPointerException.
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        //return -1; // If target not found in the array.
        // Here we can not return -1 because -1 can be an element.
        return Integer.MAX_VALUE;
    }

    // search the target and return true or false
    public static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false; // If target not found in the array.
    }
}

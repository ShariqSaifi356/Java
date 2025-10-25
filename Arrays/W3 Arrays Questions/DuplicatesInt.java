public class DuplicatesInt {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 7, 5, 7, 2, 1 };
        int target = 7;
        System.out.println(duplicatesInteger(arr, target));
        allDuplicateValuesInArray(arr);

    }

    public static int duplicatesInteger(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void allDuplicateValuesInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("Duplicate elements are: " + arr[j]);
                }
            }
        }
    }
}

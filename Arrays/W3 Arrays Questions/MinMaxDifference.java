public class MinMaxDifference {
    public static void main(String[] args) {
        // Write a Java program to get the difference between the largest and smallest
        // values in an array of integers. The array must have a length of at least 1.
        int[] arr = { -10, -5, -1, -20 };
        long difference = (long) max(arr) - (long) min(arr);
        System.out.println(
                "The difference between the largest and smallest values in an array of integers is : " + difference);
    }

    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

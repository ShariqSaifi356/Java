public class ExcludingMinMax {
    public static void main(String[] args) {
        // Write a Java program to compute the average value of an array of integers
        // except the largest and smallest values.
        int[] arr = { 5, 7, 2, 4, 9 };
        int sumAfterExcluding = sum(arr) - min(arr) - max(arr);
        double average = (double) sumAfterExcluding / (arr.length - 2);
        System.out.println(average);

        System.out.println();
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

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}

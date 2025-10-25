public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = { 32, 12, 56, 78, 21 };
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

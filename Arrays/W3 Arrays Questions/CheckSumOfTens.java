public class CheckSumOfTens {
    public static void main(String[] args) {
        // Write a Java program to check if the sum of all the 10's in the array is
        // exactly 30. Return false if the condition does not satisfy, otherwise true.
        int[] arr = { 10, 77, 10, 54, -11, 10 };
        int target = 30;
        System.out.println(checkSumOfTens(arr, target));
    }

    public static boolean checkSumOfTens(int[] arr, int target) {
        int sum = 0;
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum = sum + arr[i];
            }
        }
        if (target == sum) {
            return true;
        } else {
            return false;
        }
    }
}

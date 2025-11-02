public class CheckZeroAndMinusOne {
    public static void main(String[] args) {
        // Write a Java program to check if an array of integers is without 0 and -1.
        int[] arr = { 23, 45, 67, 21, 78, -11 };
        boolean flag = true;

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The array does NOT contain 0 or -1.");
        } else {
            System.out.println("The array contains 0 or -1.");
        }
    }
}

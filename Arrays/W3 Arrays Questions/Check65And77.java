public class Check65And77 {
    public static void main(String[] args) {
        // Write a Java program to check if an array of integers contains two specified
        // elements 65 and 77.
        int[] arr = { 77, 77, 65, 77, 65, 65, 71 };
        int targetOne = 65;
        int targetTwo = 77;
        System.out.println(check65And77(arr, targetOne, targetTwo));

    }

    public static boolean check65And77(int[] arr, int targetOne, int targetTwo) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        boolean found65 = false;
        boolean found77 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetOne) {
                found65 = true;
            }
            if (arr[i] == targetTwo) {
                found77 = true;
            }
            if (found65 && found77) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsOnly65And77(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false; // Empty or null array
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 65 && arr[i] != 77) {
                return false; // Found a number other than 65 or 77
            }
        }

        return true; // All numbers are either 65 or 77
    }
}

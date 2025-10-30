import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        Arrays.sort(arr); // ensure sorted order

        int lastNumber = arr[arr.length - 1];
        int sumOfNumbersInArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfNumbersInArray += arr[i];
        }

        int sumOfNaturalNumbers = lastNumber * (lastNumber + 1) / 2;
        int missingNumber = sumOfNaturalNumbers - sumOfNumbersInArray;

        if (missingNumber == 0) {
            System.out.println("No number is missing in the array.");
        } else {
            System.out.println("Missing number in array is: " + missingNumber);
        }
    }
}

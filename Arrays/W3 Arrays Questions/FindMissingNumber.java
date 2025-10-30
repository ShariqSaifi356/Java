public class FindMissingNumber {
    public static void main(String[] args) {
        // Write a Java program to find a missing number in an array.

        int[] arr = { 1, 2, 3, 5, 6 };

        int lastNumber = arr[arr.length - 1];
        int sumOfNumbersInArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfNumbersInArray = sumOfNumbersInArray + arr[i];
        }

        int sumOfNaturalNumbers = lastNumber * (lastNumber + 1) / 2;
        int missingNumber = sumOfNaturalNumbers - sumOfNumbersInArray;
        System.out.println("Missing number in an array is : " + missingNumber);
    }
}

import java.util.Arrays;

public class PrintAllElementsOfArray {
    public static void main(String[] args) {
        int[] arr = { 21, 43, 56, 76, 89, 9, 44 };
        // printAllElementsOfArray(arr);
        // int[] result = returnArray(arr);
        // System.out.println(Arrays.toString(result));
        // System.out.println(maxElement(arr));
        // System.out.println(minElement(arr));
        // System.out.println(sumOfElements(arr));
        // int[] result = countEvenOrOdd(arr);
        // System.out.println("Even Count: " + result[0] + ", Odd Count: " + result[1]);
        // swapArray(arr, 0, 2);
        //reverseArray(arr);
       // System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(copyArrayToAnother(arr)));
    }

    static void printAllElementsOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] returnArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    static int maxElement(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    static int minElement(int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int[] countEvenOrOdd(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[] { countEven, countOdd };
    }

    static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // nothing to reverse
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapArray(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int[] copyArrayToAnother(int[] arr){
        int[] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }
}
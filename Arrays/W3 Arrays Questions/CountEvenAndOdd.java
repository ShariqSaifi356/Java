public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 76, 12, 61, 89, 97 };
        // Write a Java program to find the number of even and odd integers in a given
        // array of integers.
        int countEven = 0;
        int countOdd = 0;

        if(arr == null || arr.length ==0){
            System.out.println("Array is empty.");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
    }
}

public class SumArray {
    public static void main(String[] args) {
        // Write a Java program to sum values of an array.

        int[] arr = {1,2,3,4};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}

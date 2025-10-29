public class PairsWithAGivenSum {
    public static void main(String[] args) {
        // Write a Java program to find all pairs of elements in an array whose sum is
        // equal to a specified number.
        int[] arr = { 2, 7, 4, -5, 11, 5, 20 };
        int traget = 15;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == traget) {
                    System.out.println(arr[i] + " + " + arr[j - 1] + " = " +traget);
                }
            }
        }
    }
}

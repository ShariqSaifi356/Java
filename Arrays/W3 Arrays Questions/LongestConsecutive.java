public class LongestConsecutive {
    public static void main(String[] args) {
        //Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
        int[] arr = { 49, 1, 3, 200, 2, 4, 70, 5, 6 };
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}

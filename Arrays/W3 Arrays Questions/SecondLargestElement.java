public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 8, 56, 45, 56, 32 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int leftVal = arr[left];
            int rightVal = arr[right];

            // Check left value
            if (leftVal > first) { 
                second = first; 
                first = leftVal; 
            } else if (leftVal > second && leftVal < first) {
                second = leftVal;
            }

            // Check right value
            if (rightVal > first) {
                second = first;
                first = rightVal;
            } else if (rightVal > second && rightVal < first) {
                second = rightVal;
            }

            left++;
            right--;
        }

        System.out.println("Second largest element: " + second);
    }
}

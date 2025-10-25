public class Average {
    public static void main(String[] args) {
        //Write a Java program to calculate the average value of array elements.
        int[] arr = {1,2,3,4};
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            count++;
        }
        double average = (double)sum/count;
        System.out.println(average);
    }
}

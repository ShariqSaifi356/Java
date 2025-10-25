import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {32,45,65,78,12};
        // Method one
        // int[] copyArr = arr;
        // System.out.println(Arrays.toString(copyArr));

        // Method two
        int[] copyArr = new int[arr.length];
        int temp = 0;
        for(int i= 0;i<arr.length;i++){
            copyArr[temp++] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));

    }
}

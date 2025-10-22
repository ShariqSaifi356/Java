public class MinVal {
    public static void main(String[] args) {
        int[] arr = {56,65,78,12,34,90};
        System.out.println(minimumValue(arr));
    }

    public static int minimumValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]< min) {
                min = arr[i];
            }
        }
        return min;
    }
}

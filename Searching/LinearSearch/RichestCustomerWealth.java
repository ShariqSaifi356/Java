package LinearSearch;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maxWealth(arr));
    }

    public static int maxWealth(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

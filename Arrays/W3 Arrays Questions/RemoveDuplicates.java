import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 10, 11, 21, 22 };
        int[] tempArr = new int[arr.length];
        int newLength = 0;

        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<newLength;j++){
                if (arr[i] == tempArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArr[newLength++] = arr[i];
            }
        }

        int[] resultArr = new int[newLength];
        for(int i=0;i<newLength; i++){
            resultArr[i] = tempArr[i];
        }

        System.out.println(Arrays.toString(resultArr));
    }
}

public class SpecificValue {
    public static void main(String[] args) {
        // Write a Java program to test if an array contains a specific value.
        int[] arr = {6,10,3,4};
        // print true if 3 is present in an array.
        int target = 8;
        boolean flag= false;

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

package LinearSearch;
public class EvenDigits2 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int countEventDigits = 0;

        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int count = 0;
            while (temp !=0) {
                temp = temp / 10;
                count++;
            }
            if (count%2==0) {
                countEventDigits++;
            }
        }

        System.out.println(countEventDigits);
    }
}

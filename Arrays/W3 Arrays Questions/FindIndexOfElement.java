public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] arr = { 32, 45, 67, 2, 7 };
        int traget = 2;
        //Write a Java program to find the index of an array element.
        for(int i=0;i<arr.length;i++){
            if (arr[i] == traget) {
                System.out.println(i);
                break;
            }
        }
    }
}

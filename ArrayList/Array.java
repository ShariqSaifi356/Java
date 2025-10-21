import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        declareArray(input);
    }

    static void declareArray(Scanner input){
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        //Printing Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
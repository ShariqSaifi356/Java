public class CommonElement {
    public static void main(String[] args) {
        // Write a Java program to find common elements between two integer arrays.

        int[] arrOne = {1,4,5,6};
        int[] arrTwo = {6,2,9,5};

        for(int i=0;i<arrOne.length;i++){
            for(int j=0;j<arrTwo.length;j++){
                if(arrOne[i] == arrTwo[j]){
                    System.out.println("Common Element is: "+ arrOne[i]);
                    break; // avoids printing same element multiple times
                }
            }
        }
    }
}

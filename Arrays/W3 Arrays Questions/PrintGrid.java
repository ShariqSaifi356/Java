public class PrintGrid {
    public static void main(String[] args) {
        char[][] arr = {
            {'*','*','*'},
            {'*','*','*'},
            {'*','*','*'}
        };

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}

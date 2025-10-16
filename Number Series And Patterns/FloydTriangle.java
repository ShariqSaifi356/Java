public class FloydTriangle {
    public static void main(String[] args) {
        int number = 5;
        int temp = 1;
        for(int i=1;i<=number; i++){
            for(int j=1;j<=i;j++){                
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }
}

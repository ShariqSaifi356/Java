public class pattern6 {
    public static void main(String[] args) {
        // (condition) ? value_if_true : value_if_false

        int num = 5;

        for(int i=1;i<=num;i++){
            for(int j=i;j<=num-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

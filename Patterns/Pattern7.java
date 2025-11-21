public class Pattern7 {
    public static void main(String[] args) {
        int num = 5;
        for(int row = 1;row<=num;row++){

            for(int space=2;space<=row;space++){
                System.out.print(" ");
            }

            for(int col=row;col<=num;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

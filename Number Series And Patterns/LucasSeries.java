public class LucasSeries {
    public static void main(String[] args) {
        int number = 10;
        int num_1 = 2;
        int num_2 = 1;
        int lucas = 0;
        System.out.print(num_1 + " " + num_2 + " ");
        for(int i=3; i<=number;i++){
            lucas = num_1 + num_2;
            num_1 = num_2;
            num_2 = lucas;
            System.out.print(lucas + " ");
        }
    }
}

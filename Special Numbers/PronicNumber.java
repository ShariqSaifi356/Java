public class PronicNumber {
    public static void main(String[] args) {

        // A Pronic Number (also called an Oblong Number or Rectangular Number) is a
        // number that is the product of two consecutive integers.
        // A number n is Pronic if it can be written as: n=k×(k+1)

        int number = 21;
        boolean isPronicNumber = false;

        for(int i=1; i*(i+1)<= number; i++){
            if (i*(i+1)==number) {
                isPronicNumber = true;
                break;
            }
        }
        if (isPronicNumber) {
            System.out.println("The given number is a Pronic Number.");
        }else{
            System.out.println("The given number is not a Pronic Number.");
        }
    }
}

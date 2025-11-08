import java.util.Scanner;

public class InputAString {
    public static void main(String[] args) {
        // Input and print a string.
        Scanner myObject = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String str = myObject.nextLine();
        System.out.println(str);     
        
        // You are done with the scanner, so you close it.
        myObject.close();
    }
}

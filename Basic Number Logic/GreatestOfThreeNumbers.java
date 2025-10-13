public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        
        int firstNumber = 22, secondNumber = 8, thirdNumber = 16;

        if(secondNumber < firstNumber && thirdNumber < firstNumber){
            System.out.println(firstNumber + " is the greatest number.");
        }
        else if(firstNumber < secondNumber && thirdNumber < secondNumber){
            System.out.println(secondNumber + " is the greatest number.");
        }
        else{
            System.out.println(thirdNumber + " is the greatest number.");

        }
    }
}

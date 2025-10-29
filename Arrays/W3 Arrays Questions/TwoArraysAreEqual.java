public class TwoArraysAreEqual {
    public static void main(String[] args) {
        int[] arrOne = { 22, 23, 24, 25 };
        int[] arrTwo = { 22, 23, 24, 25 };

        boolean isEqual = true;

        if (arrOne.length != arrTwo.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arrOne.length; i++) {
                if (arrOne[i] != arrTwo[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Both arrays are not equal.");
        }

    }
}

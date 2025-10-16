public class GeometricProgression {
    public static void main(String[] args) {
        int a = 3; // First term
        int r = 2; // Common ratio
        int n = 10; // Number of terms

        System.out.println("Geometric Progression Series:");

        for (int i = 0; i < n; i++) {
            int term = (int) (a * Math.pow(r, i));
            System.out.print(term + " ");
        }
    }
}

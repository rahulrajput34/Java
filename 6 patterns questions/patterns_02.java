// if any doubt whatch a video again
public class patterns_02 {
    public static void invertedHalfParamind(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop

            for (int j = 1; j <= n - i; j++) { // for spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfParamind(42);
    }
}

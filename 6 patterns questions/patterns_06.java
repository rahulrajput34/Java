// Butterfly pattern

public class patterns_06 {
    public static void butterFlypattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = n; i >= 1; i--) { // we do mirror of code by just changing numbers
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterFlypattern(4);
    }
}

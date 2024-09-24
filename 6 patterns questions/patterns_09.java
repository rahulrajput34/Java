public class patterns_09 {
    public static void dimondPattern(int n) {
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // for stars
                System.out.print("*");
            }
            
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // part-two
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // for stars
                System.out.print("*");
            }
            
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimondPattern(4);
    }
}

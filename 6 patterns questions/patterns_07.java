// Solid rombus pattern
public class patterns_07 {
    public static void rhombus( int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {  // for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {  // for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus(5);
    }
}
